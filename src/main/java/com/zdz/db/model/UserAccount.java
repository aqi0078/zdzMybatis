package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserAccount {
    private Long fId;

    private Long fUserId;

    private Long fCurrencyId;

    private BigDecimal fBalance;

    private BigDecimal fCrossTotalMargin;

    private BigDecimal fIsolatedTotalMargin;

    private BigDecimal fCloseProfitLoss;

    private Byte fAccountStatus;

    private Integer fVersion;

    private Date fUpdateTime;

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

    public Long getfCurrencyId() {
        return fCurrencyId;
    }

    public void setfCurrencyId(Long fCurrencyId) {
        this.fCurrencyId = fCurrencyId;
    }

    public BigDecimal getfBalance() {
        return fBalance;
    }

    public void setfBalance(BigDecimal fBalance) {
        this.fBalance = fBalance;
    }

    public BigDecimal getfCrossTotalMargin() {
        return fCrossTotalMargin;
    }

    public void setfCrossTotalMargin(BigDecimal fCrossTotalMargin) {
        this.fCrossTotalMargin = fCrossTotalMargin;
    }

    public BigDecimal getfIsolatedTotalMargin() {
        return fIsolatedTotalMargin;
    }

    public void setfIsolatedTotalMargin(BigDecimal fIsolatedTotalMargin) {
        this.fIsolatedTotalMargin = fIsolatedTotalMargin;
    }

    public BigDecimal getfCloseProfitLoss() {
        return fCloseProfitLoss;
    }

    public void setfCloseProfitLoss(BigDecimal fCloseProfitLoss) {
        this.fCloseProfitLoss = fCloseProfitLoss;
    }

    public Byte getfAccountStatus() {
        return fAccountStatus;
    }

    public void setfAccountStatus(Byte fAccountStatus) {
        this.fAccountStatus = fAccountStatus;
    }

    public Integer getfVersion() {
        return fVersion;
    }

    public void setfVersion(Integer fVersion) {
        this.fVersion = fVersion;
    }

    public Date getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(Date fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}