package com.zdz.db.dao;

import com.zdz.db.model.PositionTransaction;

public interface PositionTransactionMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(PositionTransaction record);

    int insertSelective(PositionTransaction record);

    PositionTransaction selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(PositionTransaction record);

    int updateByPrimaryKey(PositionTransaction record);
}