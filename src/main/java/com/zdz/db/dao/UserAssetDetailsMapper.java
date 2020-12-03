package com.zdz.db.dao;

import com.zdz.db.model.UserAssetDetails;

public interface UserAssetDetailsMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(UserAssetDetails record);

    int insertSelective(UserAssetDetails record);

    UserAssetDetails selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(UserAssetDetails record);

    int updateByPrimaryKey(UserAssetDetails record);
}