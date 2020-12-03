package com.zdz.db.dao;

import com.zdz.db.model.TradingOrder;

public interface TradingOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradingOrder record);

    int insertSelective(TradingOrder record);

    TradingOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradingOrder record);

    int updateByPrimaryKey(TradingOrder record);
}