package com.zdz.db.demo.test7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @Description:
 * @Date: 2020/9/15
 */
public class Test20200915 {


    public static void main(String[] args) {
        A a=new A();
        a.running();
        System.out.println("=========");
    }
}
