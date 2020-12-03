package com.zdz.db.dao;

import com.zdz.db.model.UserPosition;

public interface UserPositionMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(UserPosition record);

    int insertSelective(UserPosition record);

    UserPosition selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(UserPosition record);

    int updateByPrimaryKey(UserPosition record);
}