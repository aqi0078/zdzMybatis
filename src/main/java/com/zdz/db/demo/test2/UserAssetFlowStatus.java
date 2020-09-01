package com.zdz.db.demo.test2;

public enum UserAssetFlowStatus {
    CHECK("初始校验",0),
    TR("划转",1),
    AD("空投",2),
    BR("返佣",3),
    CO("手续费抵扣",4),
    BO("赠金",5),
    PC("回收体验金",6),
    R("划转回滚",7),
    FEE("手续费",8),
    PNL("平仓盈亏",9),
    DELIVERY("资金费用互换",10),
    CONFISCATED("强平罚没",11);
    private String name;
    private Integer status;

    UserAssetFlowStatus(String name, Integer status){
        this.name=name;
        this.status=status;
    }

    public Integer getStatus(String str){
        switch (str){
            case "tr":return UserAssetFlowStatus.TR.status;
        }
        return null;
    }
}
