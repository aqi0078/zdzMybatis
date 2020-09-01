package com.zdz.db.demo.Test5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class MainTset {
    public static void main(String[] args) {
        TestService testService=new TestServiceImpl();
        List list=new ArrayList();
        for (int i = 0; i < 5; i++) {
            Object obj=testService.convert(i+"");
            list.add(obj);
        }
        testService.execute(list);
    }
}
