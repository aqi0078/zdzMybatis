package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class CBAccountTransaction {
    private Long fId;

    private Long fUserId;

    private Long fAccountId;

    private BigDecimal fAmount;

    private BigDecimal fBalance;

    private Integer fCurrencyId;

    private Byte fBizType;

    private Long fSeq;

    private Long fTs;

    private Long fOffset;

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

    public BigDecimal getfAmount() {
        return fAmount;
    }

    public void setfAmount(BigDecimal fAmount) {
        this.fAmount = fAmount;
    }

    public BigDecimal getfBalance() {
        return fBalance;
    }

    public void setfBalance(BigDecimal fBalance) {
        this.fBalance = fBalance;
    }

    public Integer getfCurrencyId() {
        return fCurrencyId;
    }

    public void setfCurrencyId(Integer fCurrencyId) {
        this.fCurrencyId = fCurrencyId;
    }

    public Byte getfBizType() {
        return fBizType;
    }

    public void setfBizType(Byte fBizType) {
        this.fBizType = fBizType;
    }

    public Long getfSeq() {
        return fSeq;
    }

    public void setfSeq(Long fSeq) {
        this.fSeq = fSeq;
    }

    public Long getfTs() {
        return fTs;
    }

    public void setfTs(Long fTs) {
        this.fTs = fTs;
    }

    public Long getfOffset() {
        return fOffset;
    }

    public void setfOffset(Long fOffset) {
        this.fOffset = fOffset;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}