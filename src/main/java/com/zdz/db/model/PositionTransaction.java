package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class PositionTransaction {
    private Long fId;

    private Long fAccountId;

    private Integer fContractId;

    private String fFinanceCode;

    private Byte fType;

    private BigDecimal fOccurrenceValue;

    private BigDecimal fFinalValue;

    private Long fActionId;

    private Long fMatchTime;

    private Long fOffset;

    private Long fSeq;

    private Date fCreateTime;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public Long getfAccountId() {
        return fAccountId;
    }

    public void setfAccountId(Long fAccountId) {
        this.fAccountId = fAccountId;
    }

    public Integer getfContractId() {
        return fContractId;
    }

    public void setfContractId(Integer fContractId) {
        this.fContractId = fContractId;
    }

    public String getfFinanceCode() {
        return fFinanceCode;
    }

    public void setfFinanceCode(String fFinanceCode) {
        this.fFinanceCode = fFinanceCode == null ? null : fFinanceCode.trim();
    }

    public Byte getfType() {
        return fType;
    }

    public void setfType(Byte fType) {
        this.fType = fType;
    }

    public BigDecimal getfOccurrenceValue() {
        return fOccurrenceValue;
    }

    public void setfOccurrenceValue(BigDecimal fOccurrenceValue) {
        this.fOccurrenceValue = fOccurrenceValue;
    }

    public BigDecimal getfFinalValue() {
        return fFinalValue;
    }

    public void setfFinalValue(BigDecimal fFinalValue) {
        this.fFinalValue = fFinalValue;
    }

    public Long getfActionId() {
        return fActionId;
    }

    public void setfActionId(Long fActionId) {
        this.fActionId = fActionId;
    }

    public Long getfMatchTime() {
        return fMatchTime;
    }

    public void setfMatchTime(Long fMatchTime) {
        this.fMatchTime = fMatchTime;
    }

    public Long getfOffset() {
        return fOffset;
    }

    public void setfOffset(Long fOffset) {
        this.fOffset = fOffset;
    }

    public Long getfSeq() {
        return fSeq;
    }

    public void setfSeq(Long fSeq) {
        this.fSeq = fSeq;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}