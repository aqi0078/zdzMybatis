package com.zdz.db.dao;

import com.zdz.db.model.UserMatch;

public interface UserMatchMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserMatch record);

    int insertSelective(UserMatch record);

    UserMatch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMatch record);

    int updateByPrimaryKey(UserMatch record);
}