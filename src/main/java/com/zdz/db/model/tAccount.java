package com.zdz.db.model;

public class tAccount {
    private Long fId;

    private Integer fUserId;

    private Integer fParentUserId;

    private String fName;

    private String fEmail;

    private String fPhone;

    private Byte fType;

    private Byte fState;

    private Byte fAuthState;

    private Long fAuthTime;

    private Long fCreatedAt;

    private Long fUpdatedAt;

    private String fGroupName;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public Integer getfUserId() {
        return fUserId;
    }

    public void setfUserId(Integer fUserId) {
        this.fUserId = fUserId;
    }

    public Integer getfParentUserId() {
        return fParentUserId;
    }

    public void setfParentUserId(Integer fParentUserId) {
        this.fParentUserId = fParentUserId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfEmail() {
        return fEmail;
    }

    public void setfEmail(String fEmail) {
        this.fEmail = fEmail == null ? null : fEmail.trim();
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone == null ? null : fPhone.trim();
    }

    public Byte getfType() {
        return fType;
    }

    public void setfType(Byte fType) {
        this.fType = fType;
    }

    public Byte getfState() {
        return fState;
    }

    public void setfState(Byte fState) {
        this.fState = fState;
    }

    public Byte getfAuthState() {
        return fAuthState;
    }

    public void setfAuthState(Byte fAuthState) {
        this.fAuthState = fAuthState;
    }

    public Long getfAuthTime() {
        return fAuthTime;
    }

    public void setfAuthTime(Long fAuthTime) {
        this.fAuthTime = fAuthTime;
    }

    public Long getfCreatedAt() {
        return fCreatedAt;
    }

    public void setfCreatedAt(Long fCreatedAt) {
        this.fCreatedAt = fCreatedAt;
    }

    public Long getfUpdatedAt() {
        return fUpdatedAt;
    }

    public void setfUpdatedAt(Long fUpdatedAt) {
        this.fUpdatedAt = fUpdatedAt;
    }

    public String getfGroupName() {
        return fGroupName;
    }

    public void setfGroupName(String fGroupName) {
        this.fGroupName = fGroupName == null ? null : fGroupName.trim();
    }
}