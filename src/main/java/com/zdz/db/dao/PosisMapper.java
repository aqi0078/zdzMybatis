package com.zdz.db.dao;

import com.zdz.db.model.Posis;

public interface PosisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Posis record);

    int insertSelective(Posis record);

    Posis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Posis record);

    int updateByPrimaryKey(Posis record);
}