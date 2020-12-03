package com.zdz.db.dao;

import com.zdz.db.model.CBAccountTransaction;

public interface CBAccountTransactionMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(CBAccountTransaction record);

    int insertSelective(CBAccountTransaction record);

    CBAccountTransaction selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(CBAccountTransaction record);

    int updateByPrimaryKey(CBAccountTransaction record);
}