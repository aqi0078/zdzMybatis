package com.zdz.db.dao;

import com.zdz.db.model.tAccount;

public interface tAccountMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(tAccount record);

    int insertSelective(tAccount record);

    tAccount selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(tAccount record);

    int updateByPrimaryKey(tAccount record);
}