package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountInfo {
    private Long id;

    private Integer userId;

    private Integer currency;

    private BigDecimal balance;

    private BigDecimal availableBalance;

    private BigDecimal equity;

    private BigDecimal crossUnrealisedPnl;

    private BigDecimal crossOrdMargin;

    private BigDecimal crossMaintMargin;

    private BigDecimal crossEquity;

    private BigDecimal isolatedOrdMargin;

    private BigDecimal isolatedPositionMargin;

    private Byte accountStatus;

    private Date updateTime;

    private Date createTime;

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

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getEquity() {
        return equity;
    }

    public void setEquity(BigDecimal equity) {
        this.equity = equity;
    }

    public BigDecimal getCrossUnrealisedPnl() {
        return crossUnrealisedPnl;
    }

    public void setCrossUnrealisedPnl(BigDecimal crossUnrealisedPnl) {
        this.crossUnrealisedPnl = crossUnrealisedPnl;
    }

    public BigDecimal getCrossOrdMargin() {
        return crossOrdMargin;
    }

    public void setCrossOrdMargin(BigDecimal crossOrdMargin) {
        this.crossOrdMargin = crossOrdMargin;
    }

    public BigDecimal getCrossMaintMargin() {
        return crossMaintMargin;
    }

    public void setCrossMaintMargin(BigDecimal crossMaintMargin) {
        this.crossMaintMargin = crossMaintMargin;
    }

    public BigDecimal getCrossEquity() {
        return crossEquity;
    }

    public void setCrossEquity(BigDecimal crossEquity) {
        this.crossEquity = crossEquity;
    }

    public BigDecimal getIsolatedOrdMargin() {
        return isolatedOrdMargin;
    }

    public void setIsolatedOrdMargin(BigDecimal isolatedOrdMargin) {
        this.isolatedOrdMargin = isolatedOrdMargin;
    }

    public BigDecimal getIsolatedPositionMargin() {
        return isolatedPositionMargin;
    }

    public void setIsolatedPositionMargin(BigDecimal isolatedPositionMargin) {
        this.isolatedPositionMargin = isolatedPositionMargin;
    }

    public Byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}