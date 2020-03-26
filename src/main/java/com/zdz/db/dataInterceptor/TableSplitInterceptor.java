package com.zdz.db.dataInterceptor;

import com.zdz.db.dataInterceptor.appointTableName.AppointTableMap;
import com.zdz.db.dataInterceptor.appointTableName.TableNameTarget;
import com.zdz.db.dataInterceptor.service.StrategyService;
import com.zdz.db.datasource.interceptor.ints.InterceptAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;

/**
 * sql 拦截器，修改SQL
 * @author zhangdezhi
 * @date 2020-03-24
 */
@Slf4j(topic="策略分表拦截器【TableSplitInterceptor】")
@Component
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class,Integer.class }) })
public class TableSplitInterceptor  implements Interceptor {
    @Autowired
    StrategyManager strategyManager;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        log.info("进入mybatisSql拦截器：====================");
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaStatementHandler =
                MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
        Object parameterObject = metaStatementHandler.getValue("delegate.boundSql.parameterObject");
        doSplitTable(metaStatementHandler,parameterObject);
        // 传递给下一个拦截器处理
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

    @Override
    public void setProperties(Properties properties) {

    }

    private void doSplitTable(MetaObject metaStatementHandler,Object param) throws ClassNotFoundException, NoSuchMethodException {
        String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
        if (originalSql != null && !originalSql.equals("")) {
            log.info("分表前的SQL："+originalSql);
            MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
            String newTable="";
            String oldTable="";
            String id = mappedStatement.getId();

            boolean isTrue=true;

            // 获取 "方法"上的注解的值
//            Class<?> methodObj = Class.forName(id);
//            Method[] methods = methodObj.getDeclaredMethods();
//            for (Method method: methods) {
//                if(!method.getName().equals(id.substring(id.lastIndexOf(".")+1))){
//                    continue;
//                }
//                if(method.isAnnotationPresent(TableNameTarget.class)){
//                    newTable= AppointTableMap.appointName.get();
//                    TableNameTarget tableNameTarget=method.getAnnotation(TableNameTarget.class);
//                    oldTable=tableNameTarget.tableName();
//                    isTrue=false;
//                }
//                break;
//            }

            String className = id.substring(0, id.lastIndexOf("."));
            Class<?> classObj = Class.forName(className);
            TableSplitTarget tableSplit = classObj.getAnnotation(TableSplitTarget.class);
            if (!StringUtils.isEmpty(AppointTableMap.appointName.get())){
                isTrue=false;
                newTable= tableSplit.table() + AppointTableMap.appointName.get();
                oldTable=tableSplit.table();
            }
            if(isTrue){
                if(tableSplit==null||!tableSplit.interFale()) {
                    return ;
                }
                StrategyService strategyService=strategyManager.getStrategyService(tableSplit.stategy());
                newTable=strategyService.returnTableName(tableSplit.table());
                oldTable=tableSplit.table();
            }
            // 根据配置自动生成分表SQL
            String convertedSql=  originalSql.replaceAll(oldTable,newTable );
            log.info("新sql是：" + convertedSql);
            metaStatementHandler.setValue("delegate.boundSql.sql",convertedSql);
        }
    }

}
