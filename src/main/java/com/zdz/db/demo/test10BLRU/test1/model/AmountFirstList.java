package com.zdz.db.demo.test10BLRU.test1.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2020/11/27
 */
@Data
public class AmountFirstList {
    private List<AmountSecondList> amountSecondLists = new ArrayList<>();
}
