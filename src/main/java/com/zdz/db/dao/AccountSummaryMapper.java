package com.zdz.db.dao;

import com.zdz.db.model.AccountSummary;

public interface AccountSummaryMapper {
    int deleteByPrimaryKey(Long fId);

    int insert(AccountSummary record);

    int insertSelective(AccountSummary record);

    AccountSummary selectByPrimaryKey(Long fId);

    int updateByPrimaryKeySelective(AccountSummary record);

    int updateByPrimaryKey(AccountSummary record);
}