package com.zdz.db.demo.test9;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Date: 2020/11/16
 */
public class TeatMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(2,"3");
        System.out.println("===="+map);
        map.forEach((integer, s) -> {
            System.out.println(integer+":------:"+s);
        });

        B b=new B(1,2,"3");
        System.out.println("===b---"+b);
        B b1=(B)b.clone();
        System.out.println("===b1---"+b1);
        b1.setB3("2");
        System.out.println("===b1---"+b1);
        System.out.println("===b---"+b);
        run(new A1());
        System.out.println("-------------");
        run(new A2());
    }
    public static void run(A a) {
        a.test1();
        a.rule();
        a.test2();
    }
}
