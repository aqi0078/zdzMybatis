package com.zdz.db.dataInterceptor;

import com.zdz.db.dataInterceptor.service.impl.YYYYMM01StrategyServiceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */
@Configuration
public class StrategyConfig {
    /**
     * 策略配置类
     * @return
     */
    @Bean
    public StrategyManager strategyManager() {
        StrategyManager strategyManager = new StrategyManager();
        strategyManager.addStrategies(StrategyManager.Strategy.YYYYMM01,new YYYYMM01StrategyServiceServiceImpl());
        return strategyManager;
    }
}
