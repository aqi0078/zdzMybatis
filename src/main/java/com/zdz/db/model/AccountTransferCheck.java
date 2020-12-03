package com.zdz.db.model;

public class AccountTransferCheck {
    private Long fId;

    private String fBizType;

    private String fBizOrderId;

    private Long fAccountId;

    private String fTransferType;

    private Long fTimestamp;

    private String fTransferState;

    private Long fSeq;

    private Long fTs;

    private Long fOffset;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getfBizType() {
        return fBizType;
    }

    public void setfBizType(String fBizType) {
        this.fBizType = fBizType == null ? null : fBizType.trim();
    }

    public String getfBizOrderId() {
        return fBizOrderId;
    }

    public void setfBizOrderId(String fBizOrderId) {
        this.fBizOrderId = fBizOrderId == null ? null : fBizOrderId.trim();
    }

    public Long getfAccountId() {
        return fAccountId;
    }

    public void setfAccountId(Long fAccountId) {
        this.fAccountId = fAccountId;
    }

    public String getfTransferType() {
        return fTransferType;
    }

    public void setfTransferType(String fTransferType) {
        this.fTransferType = fTransferType == null ? null : fTransferType.trim();
    }

    public Long getfTimestamp() {
        return fTimestamp;
    }

    public void setfTimestamp(Long fTimestamp) {
        this.fTimestamp = fTimestamp;
    }

    public String getfTransferState() {
        return fTransferState;
    }

    public void setfTransferState(String fTransferState) {
        this.fTransferState = fTransferState == null ? null : fTransferState.trim();
    }

    public Long getfSeq() {
        return fSeq;
    }

    public void setfSeq(Long fSeq) {
        this.fSeq = fSeq;
    }

    public Long getfTs() {
        return fTs;
    }

    public void setfTs(Long fTs) {
        this.fTs = fTs;
    }

    public Long getfOffset() {
        return fOffset;
    }

    public void setfOffset(Long fOffset) {
        this.fOffset = fOffset;
    }
}