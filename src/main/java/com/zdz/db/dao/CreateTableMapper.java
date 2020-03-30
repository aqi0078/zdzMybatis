package com.zdz.db.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author zhangdezhi
 * @date 2020-03-27
 */

@Repository
public interface CreateTableMapper {
    Map<String, String> tableIsNull(@Param("tableName")String tableName);
    int createTest(@Param("tableName")String tableName);
}
