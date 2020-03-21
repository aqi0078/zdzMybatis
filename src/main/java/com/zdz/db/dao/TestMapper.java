package com.zdz.db.dao;

import com.zdz.db.datasource.interceptor.StrategyManager;
import com.zdz.db.datasource.interceptor.TableSplitRule;
import com.zdz.db.datasource.interceptor.TableSplitTarget;
import com.zdz.db.datasource.interceptor.YYYYMM01Strategy;
import com.zdz.db.datasource.interceptor.ints.InterceptAnnotation;
import com.zdz.db.model.Test;
import org.springframework.stereotype.Repository;

import java.util.Date;

@TableSplitTarget(rules={@TableSplitRule(tableName="test",paramName="",targetName= StrategyManager._YYYYMM01)})
@Repository
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);
    Test selectByPrimaryKey(Integer id);
//    @InterceptAnnotation(flag =true,description = {record})
//    Test selectByTest(Test record);
    @InterceptAnnotation(flag =true,description ="strategy")
    Test selectByPrimaryKeyAnd(Integer id, YYYYMM01Strategy yyyymm01Strategy);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}