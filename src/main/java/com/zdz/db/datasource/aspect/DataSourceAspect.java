package com.zdz.db.datasource.aspect;

import com.zdz.db.datasource.DataSourceType;
import com.zdz.db.datasource.DynamicDataSource;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
/**
 * @author zhangdezhi
 * @date 2020-03-18
 */
@Aspect
@Component
public class DataSourceAspect {
    /**
     * 切点: 所有配置 DataSource 注解的方法
     */
    @Pointcut("@annotation(com.zdz.db.datasource.aspect.DataSource)")
    public void dataSourcePointCut() {}
    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DataSource ds = method.getAnnotation(DataSource.class);
        // 通过判断 DataSource 中的值来判断当前方法应用哪个数据源
        DataSourceType.setDataBaseType(ds.value());
        System.err.println("当前数据源: " + ds.value());
        try {
            return point.proceed();
        } finally {
            DataSourceType.clearDataBaseType();
            System.err.println("当前数据源:clearDataBaseType: " + ds.value());
        }
    }
}
