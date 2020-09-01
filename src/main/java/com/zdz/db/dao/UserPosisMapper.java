package com.zdz.db.dao;

import com.zdz.db.model.UserPosis;

public interface UserPosisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserPosis record);

    int insertSelective(UserPosis record);

    UserPosis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPosis record);

    int updateByPrimaryKey(UserPosis record);
}