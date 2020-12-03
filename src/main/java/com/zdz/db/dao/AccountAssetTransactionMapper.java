package com.zdz.db.dao;

import com.zdz.db.model.AccountAssetTransaction;

public interface AccountAssetTransactionMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(AccountAssetTransaction record);

    int insertSelective(AccountAssetTransaction record);

    AccountAssetTransaction selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(AccountAssetTransaction record);

    int updateByPrimaryKey(AccountAssetTransaction record);
}