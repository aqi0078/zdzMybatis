package com.zdz.db.dataInterceptor;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 分表策略拦截
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TableSplitTarget {
    boolean interFale() default true;
    String table();
    StrategyManager.Strategy stategy()default StrategyManager.Strategy.YYYYMM01;
}
