package com.zdz.db.datasource.interceptor.ints;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangdezhi
 * @date 2020-03-19
 */

@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterceptAnnotation {
    boolean flag() default  true;

    String description();

}
