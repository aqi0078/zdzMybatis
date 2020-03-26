package com.zdz.db.dataInterceptor.service;
/**
 * 分表策略服务接口
 *
 */
public interface StrategyService {

    /**
     * 传入表名
     * @param tableName
     * @return
     */
    String returnTableName(String tableName);
}
