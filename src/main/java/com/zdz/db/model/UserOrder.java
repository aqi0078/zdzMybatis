package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserOrder {
    private Long id;

    private String orderId;

    private Integer userId;

    private String clOrdId;

    private String symbol;

    private String side;

    private Byte ordType;

    private BigDecimal price;

    private BigDecimal orderQty;

    private String ordStatus;

    private String stopPx;

    private String trigger;

    private Date triggerTime;

    private String source;

    private Date ordTime;

    private Byte reduceOnly;

    private Byte postOnly;

    private String timeInForce;

    private BigDecimal cumQty;

    private BigDecimal avgPx;

    private String cancelQty;

    private String cancelTime;

    private String ordRejReason;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getClOrdId() {
        return clOrdId;
    }

    public void setClOrdId(String clOrdId) {
        this.clOrdId = clOrdId == null ? null : clOrdId.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public Byte getOrdType() {
        return ordType;
    }

    public void setOrdType(Byte ordType) {
        this.ordType = ordType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }

    public String getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus == null ? null : ordStatus.trim();
    }

    public String getStopPx() {
        return stopPx;
    }

    public void setStopPx(String stopPx) {
        this.stopPx = stopPx == null ? null : stopPx.trim();
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger == null ? null : trigger.trim();
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getOrdTime() {
        return ordTime;
    }

    public void setOrdTime(Date ordTime) {
        this.ordTime = ordTime;
    }

    public Byte getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(Byte reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public Byte getPostOnly() {
        return postOnly;
    }

    public void setPostOnly(Byte postOnly) {
        this.postOnly = postOnly;
    }

    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce == null ? null : timeInForce.trim();
    }

    public BigDecimal getCumQty() {
        return cumQty;
    }

    public void setCumQty(BigDecimal cumQty) {
        this.cumQty = cumQty;
    }

    public BigDecimal getAvgPx() {
        return avgPx;
    }

    public void setAvgPx(BigDecimal avgPx) {
        this.avgPx = avgPx;
    }

    public String getCancelQty() {
        return cancelQty;
    }

    public void setCancelQty(String cancelQty) {
        this.cancelQty = cancelQty == null ? null : cancelQty.trim();
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    public String getOrdRejReason() {
        return ordRejReason;
    }

    public void setOrdRejReason(String ordRejReason) {
        this.ordRejReason = ordRejReason == null ? null : ordRejReason.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}