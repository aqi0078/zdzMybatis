package com.zdz.db.demo.test10BLRU.test1.model.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Date: 2020/11/27
 */
@Data
public class AmountPO {
    public AmountPO(BigDecimal amount, Long accountId){
        this.amount = amount;
        this.accountId = accountId;
    }
    private BigDecimal amount;
    private Long accountId;

    private AmountPO next;
    private Map<Long, List<AmountPO>> amountMap = new HashMap<>();
}
