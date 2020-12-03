package com.zdz.db.model;

import java.math.BigDecimal;

public class TradingOrder {
    private Long id;

    private Long clientOrderId;

    private Long accountId;

    private Integer instrumentId;

    private Integer baseCurrencyId;

    private Integer quoteCurrencyId;

    private Integer type;

    private Integer timeInForce;

    private Long timestamp;

    private Integer state;

    private Integer side;

    private BigDecimal orderPrice;

    private BigDecimal orderQty;

    private BigDecimal orderAmt;

    private BigDecimal execAmt;

    private BigDecimal execQty;

    private BigDecimal remainingQty;

    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(Long clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Integer getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Integer instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Integer getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(Integer baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public Integer getQuoteCurrencyId() {
        return quoteCurrencyId;
    }

    public void setQuoteCurrencyId(Integer quoteCurrencyId) {
        this.quoteCurrencyId = quoteCurrencyId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(Integer timeInForce) {
        this.timeInForce = timeInForce;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public BigDecimal getExecAmt() {
        return execAmt;
    }

    public void setExecAmt(BigDecimal execAmt) {
        this.execAmt = execAmt;
    }

    public BigDecimal getExecQty() {
        return execQty;
    }

    public void setExecQty(BigDecimal execQty) {
        this.execQty = execQty;
    }

    public BigDecimal getRemainingQty() {
        return remainingQty;
    }

    public void setRemainingQty(BigDecimal remainingQty) {
        this.remainingQty = remainingQty;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}