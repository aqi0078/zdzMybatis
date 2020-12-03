package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserPosition {
    private Long fId;

    private Long fUserId;

    private String fContractId;

    private Byte fCrossMargin;

    private BigDecimal fPositionCost;

    private Integer fPositionSize;

    private BigDecimal fPositionMargin;

    private BigDecimal fInitMaginRate;

    private BigDecimal fMaintMaginRate;

    private BigDecimal fOpenOrdSellQty;

    private BigDecimal fOpenOrdBuyQty;

    private Byte fCurrencyId;

    private Byte fStatus;

    private BigDecimal fRealisedPnl;

    private Long fOpenTime;

    private Integer fVersion;

    private Date fUpdateTime;

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

    public String getfContractId() {
        return fContractId;
    }

    public void setfContractId(String fContractId) {
        this.fContractId = fContractId == null ? null : fContractId.trim();
    }

    public Byte getfCrossMargin() {
        return fCrossMargin;
    }

    public void setfCrossMargin(Byte fCrossMargin) {
        this.fCrossMargin = fCrossMargin;
    }

    public BigDecimal getfPositionCost() {
        return fPositionCost;
    }

    public void setfPositionCost(BigDecimal fPositionCost) {
        this.fPositionCost = fPositionCost;
    }

    public Integer getfPositionSize() {
        return fPositionSize;
    }

    public void setfPositionSize(Integer fPositionSize) {
        this.fPositionSize = fPositionSize;
    }

    public BigDecimal getfPositionMargin() {
        return fPositionMargin;
    }

    public void setfPositionMargin(BigDecimal fPositionMargin) {
        this.fPositionMargin = fPositionMargin;
    }

    public BigDecimal getfInitMaginRate() {
        return fInitMaginRate;
    }

    public void setfInitMaginRate(BigDecimal fInitMaginRate) {
        this.fInitMaginRate = fInitMaginRate;
    }

    public BigDecimal getfMaintMaginRate() {
        return fMaintMaginRate;
    }

    public void setfMaintMaginRate(BigDecimal fMaintMaginRate) {
        this.fMaintMaginRate = fMaintMaginRate;
    }

    public BigDecimal getfOpenOrdSellQty() {
        return fOpenOrdSellQty;
    }

    public void setfOpenOrdSellQty(BigDecimal fOpenOrdSellQty) {
        this.fOpenOrdSellQty = fOpenOrdSellQty;
    }

    public BigDecimal getfOpenOrdBuyQty() {
        return fOpenOrdBuyQty;
    }

    public void setfOpenOrdBuyQty(BigDecimal fOpenOrdBuyQty) {
        this.fOpenOrdBuyQty = fOpenOrdBuyQty;
    }

    public Byte getfCurrencyId() {
        return fCurrencyId;
    }

    public void setfCurrencyId(Byte fCurrencyId) {
        this.fCurrencyId = fCurrencyId;
    }

    public Byte getfStatus() {
        return fStatus;
    }

    public void setfStatus(Byte fStatus) {
        this.fStatus = fStatus;
    }

    public BigDecimal getfRealisedPnl() {
        return fRealisedPnl;
    }

    public void setfRealisedPnl(BigDecimal fRealisedPnl) {
        this.fRealisedPnl = fRealisedPnl;
    }

    public Long getfOpenTime() {
        return fOpenTime;
    }

    public void setfOpenTime(Long fOpenTime) {
        this.fOpenTime = fOpenTime;
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
}