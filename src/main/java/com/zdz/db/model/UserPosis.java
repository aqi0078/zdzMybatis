package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserPosis {
    private Long id;

    private Integer userId;

    private String symbol;

    private Byte crossMargin;

    private BigDecimal openAmt;

    private BigDecimal positionSize;

    private BigDecimal positionMargin;

    private BigDecimal initMaginRate;

    private BigDecimal maintMaginRate;

    private BigDecimal openOrdSellQty;

    private BigDecimal openOrdBuyQty;

    private Byte marginCurr;

    private Byte status;

    private BigDecimal realisedPnl;

    private Long openTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public Byte getCrossMargin() {
        return crossMargin;
    }

    public void setCrossMargin(Byte crossMargin) {
        this.crossMargin = crossMargin;
    }

    public BigDecimal getOpenAmt() {
        return openAmt;
    }

    public void setOpenAmt(BigDecimal openAmt) {
        this.openAmt = openAmt;
    }

    public BigDecimal getPositionSize() {
        return positionSize;
    }

    public void setPositionSize(BigDecimal positionSize) {
        this.positionSize = positionSize;
    }

    public BigDecimal getPositionMargin() {
        return positionMargin;
    }

    public void setPositionMargin(BigDecimal positionMargin) {
        this.positionMargin = positionMargin;
    }

    public BigDecimal getInitMaginRate() {
        return initMaginRate;
    }

    public void setInitMaginRate(BigDecimal initMaginRate) {
        this.initMaginRate = initMaginRate;
    }

    public BigDecimal getMaintMaginRate() {
        return maintMaginRate;
    }

    public void setMaintMaginRate(BigDecimal maintMaginRate) {
        this.maintMaginRate = maintMaginRate;
    }

    public BigDecimal getOpenOrdSellQty() {
        return openOrdSellQty;
    }

    public void setOpenOrdSellQty(BigDecimal openOrdSellQty) {
        this.openOrdSellQty = openOrdSellQty;
    }

    public BigDecimal getOpenOrdBuyQty() {
        return openOrdBuyQty;
    }

    public void setOpenOrdBuyQty(BigDecimal openOrdBuyQty) {
        this.openOrdBuyQty = openOrdBuyQty;
    }

    public Byte getMarginCurr() {
        return marginCurr;
    }

    public void setMarginCurr(Byte marginCurr) {
        this.marginCurr = marginCurr;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getRealisedPnl() {
        return realisedPnl;
    }

    public void setRealisedPnl(BigDecimal realisedPnl) {
        this.realisedPnl = realisedPnl;
    }

    public Long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}