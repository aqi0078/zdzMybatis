package com.zdz.db.demo.test9;

/**
 * @Description:
 * @Date: 2020/11/16
 */
public class A2 extends A{
    @Override
    public void rule(A a) {
        a.rule();
        System.out.println("===========A2#rule====");
    }
    @Override
    public void rule() {
        System.out.println("=rule==========A2====");
    }

    @Override
    public void test1() {
        System.out.println("=test1====A2====");
    }

    @Override
    public void test2() {
        System.out.println("=test2====A2====");
    }
}
