package com.zdz.db.dataInterceptor;

import com.zdz.db.dataInterceptor.service.StrategyService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangdezhi
 * @date 2020-03-24
 */
public class StrategyManager {
    private Map<Strategy,StrategyService> strategies = new ConcurrentHashMap<Strategy,StrategyService>(10);
    //策略名称
    public enum Strategy{
        YYYYMM01("YYYYMM01","YYYYMM01");
        public String name;
        public String value;
        Strategy(String name, String value){
            this.name=name;
            this.value=value;
        }
        public String getStrategyService(){
            return this.value;
        }
    }

    public void addStrategies(Strategy strategy,StrategyService strategyService){
        strategies.put(strategy,strategyService);
    }
    public StrategyService getStrategyService(Strategy strategy){
        return strategies.get(strategy);
    }
}
