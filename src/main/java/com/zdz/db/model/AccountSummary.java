package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountSummary {
    private Long fId;

    private Long fCurrencyId;

    private String fCurrencyName;

    private String fType;

    private BigDecimal fCount;

    private Date fCheckData;

    private Date fCreateTime;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public Long getfCurrencyId() {
        return fCurrencyId;
    }

    public void setfCurrencyId(Long fCurrencyId) {
        this.fCurrencyId = fCurrencyId;
    }

    public String getfCurrencyName() {
        return fCurrencyName;
    }

    public void setfCurrencyName(String fCurrencyName) {
        this.fCurrencyName = fCurrencyName == null ? null : fCurrencyName.trim();
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    public BigDecimal getfCount() {
        return fCount;
    }

    public void setfCount(BigDecimal fCount) {
        this.fCount = fCount;
    }

    public Date getfCheckData() {
        return fCheckData;
    }

    public void setfCheckData(Date fCheckData) {
        this.fCheckData = fCheckData;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }
}