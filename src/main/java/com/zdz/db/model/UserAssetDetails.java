package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserAssetDetails {
    private Long fId;

    private Long fUserId;

    private Long fAccountId;

    private Byte fAccountType;

    private BigDecimal fAmount;

    private BigDecimal fBalance;

    private Integer fCurrencyId;

    private Integer fContractId;

    private Long fBizId;

    private Byte fBizType;

    private Long fVersion;

    private Long fBizTime;

    private String fNote;

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

    public Byte getfAccountType() {
        return fAccountType;
    }

    public void setfAccountType(Byte fAccountType) {
        this.fAccountType = fAccountType;
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

    public Integer getfContractId() {
        return fContractId;
    }

    public void setfContractId(Integer fContractId) {
        this.fContractId = fContractId;
    }

    public Long getfBizId() {
        return fBizId;
    }

    public void setfBizId(Long fBizId) {
        this.fBizId = fBizId;
    }

    public Byte getfBizType() {
        return fBizType;
    }

    public void setfBizType(Byte fBizType) {
        this.fBizType = fBizType;
    }

    public Long getfVersion() {
        return fVersion;
    }

    public void setfVersion(Long fVersion) {
        this.fVersion = fVersion;
    }

    public Long getfBizTime() {
        return fBizTime;
    }

    public void setfBizTime(Long fBizTime) {
        this.fBizTime = fBizTime;
    }

    public String getfNote() {
        return fNote;
    }

    public void setfNote(String fNote) {
        this.fNote = fNote == null ? null : fNote.trim();
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}