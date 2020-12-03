package com.zdz.db.dao;

import com.zdz.db.model.UserAccountId;

public interface UserAccountIdMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(UserAccountId record);

    int insertSelective(UserAccountId record);

    UserAccountId selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(UserAccountId record);

    int updateByPrimaryKey(UserAccountId record);
}