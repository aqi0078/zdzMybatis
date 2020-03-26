package com.zdz.db.dao;

import com.zdz.db.dataInterceptor.StrategyManager;
import com.zdz.db.dataInterceptor.TableSplitTarget;
import com.zdz.db.dataInterceptor.appointTableName.AppointTableName;
import com.zdz.db.dataInterceptor.appointTableName.TableNameTarget;
//import com.zdz.db.datasource.interceptor.StrategyManager;
//import com.zdz.db.datasource.interceptor.TableSplitRule;
//import com.zdz.db.datasource.interceptor.TableSplitTarget;
import com.zdz.db.model.Test;
import org.springframework.stereotype.Repository;

import java.util.Date;
@TableSplitTarget(interFale =true,table ="test",stategy= StrategyManager.Strategy.YYYYMM01)
//@TableSplitTarget(rules={@TableSplitRule(tableName="test",paramName="",targetName= StrategyManager._YYYYMM01)})
@Repository
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);
    Test selectByPrimaryKey(Integer id);
//    @InterceptAnnotation(flag =true,description = {record})
//    Test selectByTest(Test record);
    @TableNameTarget(flag =true,tableName ="test")
    Test selectByPrimaryKeyAnd(Integer id, AppointTableName yyyymm01Strategy);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}