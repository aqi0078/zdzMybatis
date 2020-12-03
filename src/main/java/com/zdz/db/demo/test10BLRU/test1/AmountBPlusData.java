package com.zdz.db.demo.test10BLRU.test1;


import com.zdz.db.demo.test10BLRU.test1.model.po.AmountPO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Date: 2020/11/27
 */
public class AmountBPlusData {
    private final static int count =32;

    private List<AmountPO> headList = new ArrayList<AmountPO>(Arrays.asList(new AmountPO(BigDecimal.ZERO, 0L)));

    private AmountPO head =new AmountPO(BigDecimal.ZERO, 0L);
//    public void addData(Long accountId, BigDecimal amount){
//        do {
//
//        }while (head)
//    }

    public void addData(AmountPO head, Long accountId, BigDecimal amount){
        AmountPO previous = null;
        do {
            if (head.getAccountId().compareTo(accountId) < 0){
                previous = head;
                head = head.getNext();
            }else {
                AmountPO amountPO =new AmountPO(amount, accountId);
                previous.setNext(amountPO);
                amountPO.setNext(head);
                break;
            }
        }while (head.getNext() !=null);
    }
}
