//package com.zdz.db.datasource.interceptor;
//
//import com.zdz.db.datasource.DataSourceType;
//import com.zdz.db.datasource.aspect.DataSource;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Method;
//
//@Aspect
//@Component
//public class InterceptAnnotationAspect {
//    @Pointcut("@annotation(com.zdz.db.datasource.interceptor.ints.InterceptAnnotation)")
//    public void interceptAnnotation() {}
//    @Around("interceptAnnotation()")
//    public Object around(ProceedingJoinPoint point) throws Throwable {
//        Object[] objects=point.getArgs();
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] instanceof YYYYMM01Strategy){
//                YYYYMM01Strategy yyyymm01Strategies= (YYYYMM01Strategy) objects[i];
//                StrategyRunMap.TYPE.set(yyyymm01Strategies.getStrategy());
//            }
//        }
//        System.out.println("");
//        try {
//            return point.proceed();
//        } finally {
//            StrategyRunMap.TYPE.remove();
//            System.err.println("==========88==== "+ StrategyRunMap.TYPE.get());
//        }
//    }
//}
