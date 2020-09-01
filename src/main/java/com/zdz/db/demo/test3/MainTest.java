package com.zdz.db.demo.test3;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class MainTest {
    public static void main(String[] args) {
        Test t1=new TestServiceImpl();
        Test t2=new Test2ServiceImpl();
        System.out.println(t1.getData());
        System.out.println(t2.getData());
        t1.setInfo(t1.getData());
        t2.setInfo(t2.getData());
    }
}
