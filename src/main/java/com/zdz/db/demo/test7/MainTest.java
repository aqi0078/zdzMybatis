package com.zdz.db.demo.test7;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: ZhangDeZhi
 * @Date: 2020-09-08
 */
public class MainTest {
    public static void main(String[] args) {
//        a.execute(seq->a.test(seq));
//        a.ex(seq->a.test(seq),data->a.test(data));
//        System.out.println("======");
//        int aa=a.exBiConsumer((t1,t2)->a.test1(t1,t2));
//        System.out.println("======"+aa);

        List<A> list=new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            A a = new A();
            a.setI(i);
            a.setName(i+"");
            list.add(a);
        }
        AtomicInteger j= new AtomicInteger(100);
        Lists.reverse(list).forEach(a -> {
            a.setI(a.getI()+ (j.getAndIncrement()));
        });

        for (int i = 0; i < 10 ; i++) {
            System.out.println(list.get(i));
        }

    }
}
