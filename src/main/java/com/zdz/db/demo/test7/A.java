package com.zdz.db.demo.test7;

import lombok.Data;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @Author: ZhangDeZhi
 * @Date: 2020-09-08
 */
@Data
public class A {


    private String name;
    private Integer i;


    private  final ExecutorService executorService = Executors
            .newFixedThreadPool(3, new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    final Thread t = Executors.defaultThreadFactory().newThread(r);
                    t.setName("reload");
                    return t;
                }
            });
    public  void running() {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("===1======");
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("===2======");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("===3======");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
        }

        System.out.println("===44444======");
    }



    public void execute(Consumer<Long> consumer) {

        consumer.accept(1L);
    }


    public void ex(Consumer<Long> consumer,Consumer<Long> consumer1) {

        consumer.accept(1L);
        consumer1.accept(2L);
    }


    public int exBiConsumer(BiConsumer<Long,Long> consumer) {

        consumer.accept(1L,2L);
        return 3;
    }

    public void test(long data) {
        System.out.println("===="+data);
    }

    public void test1(long data,long data1) {
        System.out.println(data1+"===="+data);
    }
}
