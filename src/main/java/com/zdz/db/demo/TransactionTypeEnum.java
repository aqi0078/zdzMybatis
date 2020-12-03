package com.zdz.db.demo;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum TransactionTypeEnum {
    FEE(100, 3001),//"手续费"

    PNL(101, 3004),//"平仓盈亏",

    DELIVERY(102, 3007),//"资金费用互换",

    CONFISCATED(103, 3008),//"强平罚没",

    FORCEREDUCE( 104, 3004);//"强减",
    private static final Map<Integer,Integer> MAP =
            ImmutableMap.copyOf(Arrays.stream(TransactionTypeEnum.values())
                    .collect(Collectors.toMap(TransactionTypeEnum::getType, TransactionTypeEnum::getFlowType)));
    private Integer type;
    private Integer flowType;

    TransactionTypeEnum(Integer type, Integer flowType) {
        this.type = type;
        this.flowType = flowType;
    }
    public Integer getType() {
        return this.type;
    }
    public Integer getFlowType() {
        return this.flowType;
    }
    public static Integer queryFlowType(Integer type){
        return MAP.get(type);
    }

}
