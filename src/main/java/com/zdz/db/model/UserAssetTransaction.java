package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserAssetTransaction {
    private Long fId;

    private Long fUserId;

    private Integer fCurrency;

    private Byte fFlowStatus;

    private BigDecimal fFlowAmt;

    private Long fBizId;

    private Long fVersion;

    private Long fOccurTime;

    private String fNote;

    private Date fCreateTime;

    private Integer fContractId;

    private BigDecimal fBalance;

    private Integer fAccountId;

    private Byte fAccountType;

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

    public Integer getfCurrency() {
        return fCurrency;
    }

    public void setfCurrency(Integer fCurrency) {
        this.fCurrency = fCurrency;
    }

    public Byte getfFlowStatus() {
        return fFlowStatus;
    }

    public void setfFlowStatus(Byte fFlowStatus) {
        this.fFlowStatus = fFlowStatus;
    }

    public BigDecimal getfFlowAmt() {
        return fFlowAmt;
    }

    public void setfFlowAmt(BigDecimal fFlowAmt) {
        this.fFlowAmt = fFlowAmt;
    }

    public Long getfBizId() {
        return fBizId;
    }

    public void setfBizId(Long fBizId) {
        this.fBizId = fBizId;
    }

    public Long getfVersion() {
        return fVersion;
    }

    public void setfVersion(Long fVersion) {
        this.fVersion = fVersion;
    }

    public Long getfOccurTime() {
        return fOccurTime;
    }

    public void setfOccurTime(Long fOccurTime) {
        this.fOccurTime = fOccurTime;
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

    public Integer getfContractId() {
        return fContractId;
    }

    public void setfContractId(Integer fContractId) {
        this.fContractId = fContractId;
    }

    public BigDecimal getfBalance() {
        return fBalance;
    }

    public void setfBalance(BigDecimal fBalance) {
        this.fBalance = fBalance;
    }

    public Integer getfAccountId() {
        return fAccountId;
    }

    public void setfAccountId(Integer fAccountId) {
        this.fAccountId = fAccountId;
    }

    public Byte getfAccountType() {
        return fAccountType;
    }

    public void setfAccountType(Byte fAccountType) {
        this.fAccountType = fAccountType;
    }
}