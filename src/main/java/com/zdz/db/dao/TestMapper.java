package com.zdz.db.dao;

import com.zdz.db.datasource.interceptor.StrategyManager;
import com.zdz.db.datasource.interceptor.TableSplitRule;
import com.zdz.db.datasource.interceptor.TableSplitTarget;
import com.zdz.db.datasource.interceptor.ints.InterceptAnnotation;
import com.zdz.db.model.Test;
import org.springframework.stereotype.Repository;

@TableSplitTarget(rules={@TableSplitRule(tableName="test",paramName="",targetName= StrategyManager._YYYYMM01)})
@Repository
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);
    @InterceptAnnotation(flag =true)
    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}