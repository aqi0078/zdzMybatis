package com.zdz.db.datasource.interceptor.ints;

/**
 * @author zhangdezhi
 * @date 2020-03-19
 */
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Properties;

import java.util.Properties;

/**
 * <pre>
 *  Mybatis SQL拦截器
 */
@Component
@Intercepts(@Signature(type = Executor.class, method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class MybatisSqlInterceptor implements Interceptor {

    Logger  LOGGER = LoggerFactory.getLogger(MybatisSqlInterceptor.class);
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 拦截sql
        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object parameterObject = args[1];
        BoundSql boundSql = statement.getBoundSql(parameterObject);
        String sql = boundSql.getSql();
        LOGGER.info("获取到的SQL：{}"+sql);
        System.out.println("拦截的对象是1："+invocation.getTarget());
        System.out.println("拦截方法是1："+invocation.getMethod().toString());
        System.out.println("拦截参数是1："+invocation.getArgs().length);
////        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
////        MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
//        String mSql = sql;
//
//        MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
//        Class<?> classType = Class.forName(mappedStatement.getId().substring(0, mappedStatement.getId().lastIndexOf(".")));
//        String mName = mappedStatement.getId().substring(mappedStatement.getId().lastIndexOf(".") + 1, mappedStatement.getId().length());
//        for (Method method : classType.getDeclaredMethods()) {
//            if (method.isAnnotationPresent(InterceptAnnotation.class) && mName.equals(method.getName())) {
//                InterceptAnnotation interceptorAnnotation = method.getAnnotation(InterceptAnnotation.class);
//                if (interceptorAnnotation.flag()) {
//                    mSql = sql + " limit 2,2";
//                }
//            }
//        }
        if (StringUtils.isBlank(sql)) {
            return invocation.proceed();
        }
        //通过反射修改sql语句
//        Field field = boundSql.getClass().getDeclaredField("sql");
//        field.setAccessible(true);
//        field.set(boundSql, mSql);
        // 返回
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object obj) {
        return Plugin.wrap(obj, this);
    }

    @Override
    public void setProperties(Properties arg0) {}

}
