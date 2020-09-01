package com.zdz.db.demo.test6;

import java.util.*;
import java.util.concurrent.*;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/17
 */
public class TestB {
    public TestB(){
        this.thread=add("999999");
    }
    public static Thread thread;
    public Thread add(String str){
        return new Thread(){
            @Override
            public void run() {
//                thread.interrupt();
                while (!Thread.currentThread().isInterrupted()){
                    try {
//                        throw new RuntimeException("werfx");
//                        System.out.println("========"+str);
//                        Thread.sleep(100);
                        int i=0;
                        i=1/i;
                    }catch (Exception e){

                        System.out.println(e.getClass().getName()+"=====111111111111==="+e.getMessage());
                    }
                }
//                try {
//                    Thread.sleep(100000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("===234====="+str);
            }
        };

    }
    public void runn(){
        this.thread.start();
    }
    public void interrupt(){
        this.thread.interrupt();
    }
    public class AA{
        private int i;
        AA(int i){
            this.i=i;
        }
    }
    public static void as(List list) {
        list.add(11);
    }
    public static String asss(String str) {
        try {
            throw new KafkaConsumerAssignedException("456yhjm");
        }catch (KafkaConsumerAssignedException e){
            System.out.println("======"+e);
        }
        return str;
    }
    public static void main(String[] args) throws Exception {
        try {
            asss("fgdhjfk");
        }catch (KafkaConsumerAssignedException e){

        }
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        //JDK目前为止返回的都是FutureTask的实例
//        Callable callable=()->asss("d");
//        Future<String> future = executor.submit(callable);
//        try {
//            String str= (String)future.get(3,TimeUnit.SECONDS);
//        }catch (Exception e){
//            System.out.println("890987898"+e);
//        }
//        System.out.println();
//        System.out.println(future.get());
//        String str= (String) callable.call();
//        System.out.println("======="+str);
//        Integer count=null;
//        if((count ==null?2:count)-0>1){
//            System.out.println("890987898");
//        }


//        int i=0;
//        while (i++<10){
//            if (i%5==0){
//                System.out.println("------"+i);
////                continue;
//            }
//            System.out.println("=========="+i);
//        }
//        TestB testB=new TestB();
//        testB.runn();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        testB.interrupt();

//        List list=new ArrayList();
//        as(list);
//        System.out.println(list);
//        BB b=new BB("");
//        b.abc();
//        BB b1=new BB("",1);
//        try {
//            int ii=0;
//            Integer ia = null;
////            ii=ia.hashCode();
//            ii=1/0;
//        }catch (Exception e){
//            System.out.println("=="+e.getClass().getName());
//        }
////        Collections.SingletonMap
//        Map<BB, Integer> map=new HashMap<>();
//        map.put(new BB("str",0),0);
//        map.put(new BB("str",0),0);
//        System.out.println("========"+map);
//        Map<BB, Integer> map1= Collections.singletonMap(new BB("str",0),0);
//        Map<String,String> map=Collections.singletonMap("1","12");
//        Collections.s
//        TestB testB=new TestB();
//        System.out.println("========");
//        testB.runn();
    }

}
