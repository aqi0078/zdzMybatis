package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountAsset {
    private Long fId;

    private Long fUserId;

    private Long fAccountId;

    private Integer fCurrencyId;

    private Byte fBalanceType;

    private BigDecimal fBalance;

    private Byte fState;

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

    public Long getfAccountId() {
        return fAccountId;
    }

    public void setfAccountId(Long fAccountId) {
        this.fAccountId = fAccountId;
    }

    public Integer getfCurrencyId() {
        return fCurrencyId;
    }

    public void setfCurrencyId(Integer fCurrencyId) {
        this.fCurrencyId = fCurrencyId;
    }

    public Byte getfBalanceType() {
        return fBalanceType;
    }

    public void setfBalanceType(Byte fBalanceType) {
        this.fBalanceType = fBalanceType;
    }

    public BigDecimal getfBalance() {
        return fBalance;
    }

    public void setfBalance(BigDecimal fBalance) {
        this.fBalance = fBalance;
    }

    public Byte getfState() {
        return fState;
    }

    public void setfState(Byte fState) {
        this.fState = fState;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}