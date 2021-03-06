//package com.zdz.db.datasource.interceptor;
//
//import com.zdz.db.datasource.interceptor.ints.InterceptAnnotation;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.reflection.DefaultReflectorFactory;
//import org.apache.ibatis.reflection.MetaObject;
//import org.apache.ibatis.reflection.SystemMetaObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.Type;
//import java.sql.Connection;
//import java.util.Map;
//import java.util.Properties;
//
///**
// * @author zhangdezhi
// * @date 2020-03-19
// */
//@Slf4j(topic="策略分表拦截器【TableSplitInterceptor】")
//@Component
//@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class,Integer.class }) })
//public class TableSplitInterceptor implements Interceptor {
//
//    @Autowired
//    StrategyManager strategyManager;
//
//    @Override
//    public Object intercept(Invocation invocation) throws Throwable {
//        log.info("进入mybatisSql拦截器：====================");
//        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
//        MetaObject metaStatementHandler =
//                MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
//        Object parameterObject = metaStatementHandler.getValue("delegate.boundSql.parameterObject");
//        doSplitTable(metaStatementHandler,parameterObject);
//        // 传递给下一个拦截器处理
//        return invocation.proceed();
//    }
//
//    @Override
//    public Object plugin(Object arg0) {
//        //System.err.println(arg0.getClass());
//        if (arg0 instanceof StatementHandler) {
//            return Plugin.wrap(arg0, this);
//        } else {
//            return arg0;
//        }
//    }
//
//    @Override
//    public void setProperties(Properties arg0) {
//
//    }
//
//    private void doSplitTable(MetaObject metaStatementHandler,Object param) throws ClassNotFoundException{
//        String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
//        System.out.println("++++++*************=====================");
//        if (originalSql != null && !originalSql.equals("")) {
//            log.info("分表前的SQL："+originalSql);
//           MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
//            String id = mappedStatement.getId();
//            System.out.println("id======"+id);
//            String className = id.substring(0, id.lastIndexOf("."));
//            Class<?> classObj = Class.forName(className);
//            // 根据配置自动生成分表SQL
//            TableSplitTarget tableSplit = classObj.getAnnotation(TableSplitTarget.class);
//            if(tableSplit==null||!tableSplit.interFale()) {
//                return ;
//            }
//            TableSplitRule[] rules = tableSplit.rules();
//            if (rules != null && rules.length>0) {
//
//                String convertedSql= null;
//                // StrategyManager可以使用ContextHelper策略帮助类获取，本次使用注入
//                for(TableSplitRule rule : rules) {
//                    Strategy strategy = null;
//
//                    if(rule.targetName()!=null&&!rule.targetName().isEmpty()) {
//                        strategy = strategyManager.getStrategy(rule.targetName());
//                    }
//
//                    Class<?> methodObj = Class.forName(className);
//                    // 获取 "方法"上的注解的值
//                    Method[] methods = methodObj.getDeclaredMethods();
//                    for (Method method: methods){
//                        if(!method.getName().equals(id.substring(id.lastIndexOf(".")+1))){
//                            continue;
//                        }
//                        if(method.isAnnotationPresent(InterceptAnnotation.class)){
//                            String str=StrategyRunMap.TYPE.get();
//
//                            String newTableName = rule.tableName()+str;
//
//                            try {
//                                convertedSql = originalSql.replaceAll(rule.tableName(),newTableName );
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                            log.info("新sql是：" + convertedSql);
//                            metaStatementHandler.setValue("delegate.boundSql.sql",convertedSql);
//                            return;
//                        }
//                    }
//                    // 根据配置自动生成分表SQL
////                    InterceptAnnotation interceptAnnotation = methodObj.getAnnotation(InterceptAnnotation.class);
////                    if (interceptAnnotation!=null&&interceptAnnotation.flag()){
////                        String str=StrategyRunMap.TYPE.get();
////
////                        String newTableName = rule.tableName()+str;
////
////                        try {
////                            convertedSql = originalSql.replaceAll(rule.tableName(),newTableName );
////                        } catch (Exception e) {
////                            e.printStackTrace();
////                        }
////                    }else
//                    if(rule.paramName().isEmpty()&&!rule.tableName().isEmpty()) {
//                        //获取 参数
//                        String newTableName = strategy.returnTableName(rule.tableName(), null);
//
//                        try {
//                            convertedSql = originalSql.replaceAll(rule.tableName(),newTableName );
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }else
//                    if(!rule.paramName().isEmpty()&&!rule.tableName().isEmpty()) {
//                        String paramValue ="";// getParamValue(param, rule.paramName());
//                        System.err.println("paramValue:"+paramValue);
//                        //获取 参数
//                        String newTableName = strategy.returnTableName(rule.tableName(), paramValue);
//                        try {
//                            convertedSql = originalSql.replaceAll(rule.tableName(),newTableName );
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                }
//                log.info("新sql是：" + convertedSql);
//                metaStatementHandler.setValue("delegate.boundSql.sql",convertedSql);
//            }
//        }
//    }
//
//    public String getParamValue(Object obj,String paramName) {
//        if(obj instanceof Map) {
//            return (String) ((Map) obj).get(paramName);
//        }
//        Field[] fields = obj.getClass().getDeclaredFields();
//        for(Field field : fields) {
//            field.setAccessible(true);
//            try {
//                System.err.println(field.getName()+"==="+paramName+"::=="+field.get(obj).toString());
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//            if(field.getName().equalsIgnoreCase(paramName)) {
//                try {
//                    return (String) field.get(obj);
//                } catch (IllegalArgumentException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//        return null;
//    }
//
//}
//
//
