package com.zdz.db.datasource.aspect;

import com.zdz.db.datasource.DataSourceType;

import java.lang.annotation.*;

/**
 * 多数据源注解
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    DataSourceType.DataBaseType value() default DataSourceType.DataBaseType.TEST01;
}
