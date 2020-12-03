package com.zdz.db.dao;

import com.zdz.db.model.AccountTransferCheck;

public interface AccountTransferCheckMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(AccountTransferCheck record);

    int insertSelective(AccountTransferCheck record);

    AccountTransferCheck selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(AccountTransferCheck record);

    int updateByPrimaryKey(AccountTransferCheck record);
}