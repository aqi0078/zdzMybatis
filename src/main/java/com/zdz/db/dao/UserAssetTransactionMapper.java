package com.zdz.db.dao;

import com.zdz.db.model.UserAssetTransaction;

public interface UserAssetTransactionMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(UserAssetTransaction record);

    int insertSelective(UserAssetTransaction record);

    UserAssetTransaction selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(UserAssetTransaction record);

    int updateByPrimaryKey(UserAssetTransaction record);
}