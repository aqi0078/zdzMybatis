package com.zdz.db.dataInterceptor.appointTableName;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TableNameTarget {
    boolean flag() default  true;
    String tableName();
}
