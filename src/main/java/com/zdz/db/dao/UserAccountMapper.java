package com.zdz.db.dao;

import com.zdz.db.model.UserAccount;

public interface UserAccountMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}