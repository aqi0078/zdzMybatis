package com.zdz.db.dao;

import com.zdz.db.model.UserAssetFlow;

public interface UserAssetFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAssetFlow record);

    int insertSelective(UserAssetFlow record);

    UserAssetFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAssetFlow record);

    int updateByPrimaryKey(UserAssetFlow record);
}