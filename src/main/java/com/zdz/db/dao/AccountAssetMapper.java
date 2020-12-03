package com.zdz.db.dao;

import com.zdz.db.model.AccountAsset;

public interface AccountAssetMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(AccountAsset record);

    int insertSelective(AccountAsset record);

    AccountAsset selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(AccountAsset record);

    int updateByPrimaryKey(AccountAsset record);
}