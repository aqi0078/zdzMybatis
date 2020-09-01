package com.zdz.db.demo.test4;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class MainTest {
    public static void main(String[] args) {
        TestService t1=new Test1ServiceImpl();
        TestService t2=new Test2ServiceImpl();
        Object str=t2.getObj();
        t2.getData(str,1);
        t2.setInfo(str);


        Object i=t1.getObj();
        t1.getData(i,1);
        t1.setInfo(i);
    }
}
