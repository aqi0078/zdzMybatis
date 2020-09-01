package com.zdz.db.demo;

import com.google.common.collect.Lists;
import org.springframework.dao.DataIntegrityViolationException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class MainTest {

    public static void te(Throwable throwable) {
        if (throwable instanceof NullPointerException){
            System.out.println("==11=NullPointerException====");
        }
        if (throwable instanceof Exception){
            System.out.println("==222=Exception====");
        }
        if (throwable instanceof RuntimeException){
            System.out.println("==333=Exception====");
        }
        if (throwable instanceof SQLException){
            System.out.println("==444=Exception====");
        }

    }
    public static int getData(){
        int i=0;
        while (true){
            try {
                System.out.println("======");
                break;
//                return 5/i;
            }catch (Exception e){
                i=1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(getData());

//        List list=null;
//
//        try {
//            List<List<Integer>> userPositionLists = Lists.partition(list, 100);
//        }catch (Exception e){
//            System.out.println("===Exception===="+e.getMessage());
//            te(e);
//        }
//
//        try {
//            int i=1/0;
//        }catch (NullPointerException e){
//            System.out.println("===null===="+e);
////            Throwable.
//        }catch (Exception e){
//            System.out.println("===Exception===="+e);
//            te(e);
//        }
//        List l=new ArrayList();
//        List l1=new ArrayList();
//        l.addAll(l1);
//        System.out.println(l.size());
//        List list=null;
//        List l=new ArrayList();
//        l.addAll(list);
//        ThreadDemo threadDemo=new ThreadDemo();
//        Thread t1=new Thread(threadDemo);
//        t1.setName("Thread_demo_");
//        t1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t1.interrupt();
    }
}
