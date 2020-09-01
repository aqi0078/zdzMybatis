package com.zdz.db.model;

import java.math.BigDecimal;

public class UserMatch {
    private Long id;

    private String execId;

    private String symbol;

    private String side;

    private Integer bidUserId;

    private Integer askUserId;

    private Integer bidOrderId;

    private Integer askOrderId;

    private Integer lastQty;

    private BigDecimal lastPx;

    private BigDecimal grossTradeAmt;

    private Byte bidMatchType;

    private Byte askMatchType;

    private Byte bidPnlType;

    private Byte askPnlType;

    private Long exectime;

    private BigDecimal bidFee;

    private BigDecimal askFee;

    private BigDecimal bidPnl;

    private BigDecimal askPnl;

    private BigDecimal bidConfiscatedAmt;

    private BigDecimal askConfiscatedAmt;

    private Integer selfTradeQty;

    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId == null ? null : execId.trim();
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

    public Integer getBidUserId() {
        return bidUserId;
    }

    public void setBidUserId(Integer bidUserId) {
        this.bidUserId = bidUserId;
    }

    public Integer getAskUserId() {
        return askUserId;
    }

    public void setAskUserId(Integer askUserId) {
        this.askUserId = askUserId;
    }

    public Integer getBidOrderId() {
        return bidOrderId;
    }

    public void setBidOrderId(Integer bidOrderId) {
        this.bidOrderId = bidOrderId;
    }

    public Integer getAskOrderId() {
        return askOrderId;
    }

    public void setAskOrderId(Integer askOrderId) {
        this.askOrderId = askOrderId;
    }

    public Integer getLastQty() {
        return lastQty;
    }

    public void setLastQty(Integer lastQty) {
        this.lastQty = lastQty;
    }

    public BigDecimal getLastPx() {
        return lastPx;
    }

    public void setLastPx(BigDecimal lastPx) {
        this.lastPx = lastPx;
    }

    public BigDecimal getGrossTradeAmt() {
        return grossTradeAmt;
    }

    public void setGrossTradeAmt(BigDecimal grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
    }

    public Byte getBidMatchType() {
        return bidMatchType;
    }

    public void setBidMatchType(Byte bidMatchType) {
        this.bidMatchType = bidMatchType;
    }

    public Byte getAskMatchType() {
        return askMatchType;
    }

    public void setAskMatchType(Byte askMatchType) {
        this.askMatchType = askMatchType;
    }

    public Byte getBidPnlType() {
        return bidPnlType;
    }

    public void setBidPnlType(Byte bidPnlType) {
        this.bidPnlType = bidPnlType;
    }

    public Byte getAskPnlType() {
        return askPnlType;
    }

    public void setAskPnlType(Byte askPnlType) {
        this.askPnlType = askPnlType;
    }

    public Long getExectime() {
        return exectime;
    }

    public void setExectime(Long exectime) {
        this.exectime = exectime;
    }

    public BigDecimal getBidFee() {
        return bidFee;
    }

    public void setBidFee(BigDecimal bidFee) {
        this.bidFee = bidFee;
    }

    public BigDecimal getAskFee() {
        return askFee;
    }

    public void setAskFee(BigDecimal askFee) {
        this.askFee = askFee;
    }

    public BigDecimal getBidPnl() {
        return bidPnl;
    }

    public void setBidPnl(BigDecimal bidPnl) {
        this.bidPnl = bidPnl;
    }

    public BigDecimal getAskPnl() {
        return askPnl;
    }

    public void setAskPnl(BigDecimal askPnl) {
        this.askPnl = askPnl;
    }

    public BigDecimal getBidConfiscatedAmt() {
        return bidConfiscatedAmt;
    }

    public void setBidConfiscatedAmt(BigDecimal bidConfiscatedAmt) {
        this.bidConfiscatedAmt = bidConfiscatedAmt;
    }

    public BigDecimal getAskConfiscatedAmt() {
        return askConfiscatedAmt;
    }

    public void setAskConfiscatedAmt(BigDecimal askConfiscatedAmt) {
        this.askConfiscatedAmt = askConfiscatedAmt;
    }

    public Integer getSelfTradeQty() {
        return selfTradeQty;
    }

    public void setSelfTradeQty(Integer selfTradeQty) {
        this.selfTradeQty = selfTradeQty;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}