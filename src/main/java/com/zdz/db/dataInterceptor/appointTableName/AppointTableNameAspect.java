package com.zdz.db.dataInterceptor.appointTableName;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */
@Aspect
@Component
public class AppointTableNameAspect {
    @Pointcut("@annotation(com.zdz.db.dataInterceptor.appointTableName.TableNameTarget)")
    public void tableNameTarget() {}
    @Around("tableNameTarget()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object[] objects=point.getArgs();
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof AppointTableName){
                AppointTableName appointTableName= (AppointTableName) objects[i];
                AppointTableMap.appointName.set(appointTableName.getTableName());
            }
        }
        try {
            return point.proceed();
        } finally {
            AppointTableMap.appointName.remove();
            System.err.println("==========88==== "+  AppointTableMap.appointName.get());
        }
    }
}
