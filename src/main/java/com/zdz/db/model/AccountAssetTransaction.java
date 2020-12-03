package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountAssetTransaction {
    private Long fId;

    private Long fUserId;

    private Long fAccountId;

    private Byte fAccountType;

    private Integer fCurrencyId;

    private Byte fTransferType;

    private BigDecimal fAmount;

    private BigDecimal fFee;

    private Byte fBizType;

    private BigDecimal fBalance;

    private Long fBizOrderId;

    private Date fBizTime;

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

    public Byte getfAccountType() {
        return fAccountType;
    }

    public void setfAccountType(Byte fAccountType) {
        this.fAccountType = fAccountType;
    }

    public Integer getfCurrencyId() {
        return fCurrencyId;
    }

    public void setfCurrencyId(Integer fCurrencyId) {
        this.fCurrencyId = fCurrencyId;
    }

    public Byte getfTransferType() {
        return fTransferType;
    }

    public void setfTransferType(Byte fTransferType) {
        this.fTransferType = fTransferType;
    }

    public BigDecimal getfAmount() {
        return fAmount;
    }

    public void setfAmount(BigDecimal fAmount) {
        this.fAmount = fAmount;
    }

    public BigDecimal getfFee() {
        return fFee;
    }

    public void setfFee(BigDecimal fFee) {
        this.fFee = fFee;
    }

    public Byte getfBizType() {
        return fBizType;
    }

    public void setfBizType(Byte fBizType) {
        this.fBizType = fBizType;
    }

    public BigDecimal getfBalance() {
        return fBalance;
    }

    public void setfBalance(BigDecimal fBalance) {
        this.fBalance = fBalance;
    }

    public Long getfBizOrderId() {
        return fBizOrderId;
    }

    public void setfBizOrderId(Long fBizOrderId) {
        this.fBizOrderId = fBizOrderId;
    }

    public Date getfBizTime() {
        return fBizTime;
    }

    public void setfBizTime(Date fBizTime) {
        this.fBizTime = fBizTime;
    }
}