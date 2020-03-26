package com.zdz.db.dataInterceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */
@Configuration
public class InterceptConfig {
    /**
     * mybatis分表拦截器
     * @returnTableName
     */
    @Bean
    public TableSplitInterceptor initTableSplitInterceptor() {
        return new TableSplitInterceptor();
    }
}
