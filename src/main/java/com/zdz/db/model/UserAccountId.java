package com.zdz.db.model;

import java.util.Date;

public class UserAccountId {
    private Long fId;

    private Long fUserId;

    private Byte fAccountType;

    private Byte fBalanceType;

    private Long fAccountId;

    private Date fCreateTime;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public Long getfUserId() {
        return fUserId;
    }

    public void setfUserId(Long fUserId) {
        this.fUserId = fUserId;
    }

    public Byte getfAccountType() {
        return fAccountType;
    }

    public void setfAccountType(Byte fAccountType) {
        this.fAccountType = fAccountType;
    }

    public Byte getfBalanceType() {
        return fBalanceType;
    }

    public void setfBalanceType(Byte fBalanceType) {
        this.fBalanceType = fBalanceType;
    }

    public Long getfAccountId() {
        return fAccountId;
    }

    public void setfAccountId(Long fAccountId) {
        this.fAccountId = fAccountId;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}