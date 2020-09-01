package com.zdz.db.model;

import java.math.BigDecimal;
import java.util.Date;

public class UserAssetFlow {
    private Long id;

    private Integer userId;

    private Integer currency;

    private Byte flowStatus;

    private BigDecimal flowAmt;

    private Long relationId;

    private Integer version;

    private Long occureTime;

    private String note;

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

    public Byte getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(Byte flowStatus) {
        this.flowStatus = flowStatus;
    }

    public BigDecimal getFlowAmt() {
        return flowAmt;
    }

    public void setFlowAmt(BigDecimal flowAmt) {
        this.flowAmt = flowAmt;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getOccureTime() {
        return occureTime;
    }

    public void setOccureTime(Long occureTime) {
        this.occureTime = occureTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}