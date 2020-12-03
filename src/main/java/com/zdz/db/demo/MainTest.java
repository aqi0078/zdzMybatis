package com.zdz.db.demo;

import com.google.common.collect.Lists;
import org.springframework.dao.DataIntegrityViolationException;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    public static Integer getS(){
        String str ="tr";
        switch (str){
            case "tr":return 1;
        }
        return null;
    }
    public static void main(String[] args) {


        System.out.println("--------"+getS());
        BigDecimal b1=new BigDecimal(12);
        BigDecimal b2=new BigDecimal(23);
        BigDecimal b3=b2.add(b1);
        System.out.println("====--=="+b1);
        System.out.println("====--=="+b2);
        System.out.println("====--=="+b3);
//
//        System.out.println(String.format("%010d",11));
//        BigDecimal bigDecimal=new BigDecimal("-2");
//        System.out.println(bigDecimal.signum());
//        System.out.println(bigDecimal.negate());
//        BigDecimal bigDecimal1=new BigDecimal("2");
//        System.out.println("-!!!!!!"+bigDecimal1.negate());
//        System.out.println("-!###"+bigDecimal1.abs());
//        System.out.println("-!###"+bigDecimal.abs());
//        System.out.println(String.format("%02d",2));

//        System.out.println(TransactionTypeEnum.queryFlowType(100));
//        BigDecimal bigDecimal=new BigDecimal("1001.453432");
//        System.out.println(bigDecimal.stripTrailingZeros().toPlainString());
//        ArrayList<Integer> lists = new ArrayList<Integer>();
//        // 初始化10个测试数据
//        for (int i = 0; i < 10; i++) {
//            lists.add(i);
//        }
//        List<Integer> list11=Lists.reverse(lists);
//        System.out.println("====="+lists);
//        System.out.println("====="+list11);
//        // 打印测试数据
//        for (Integer n : lists) {
//            System.out.print(n + " ");
//        }

        // 反转lists
//        Collections.reverse(lists);
//        Iterator<Integer> iterator=Lists.reverse(lists).iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        List<Integer> list=new ArrayList<>();
//        List<Integer> list1=Lists.reverse(lists);
//        list.addAll(list1);//.subList(0,lists.size());
//
//        System.out.println();
//
//        for (Integer n : list) {
//            System.out.print(n + "----- ");
//        }
//        // 换行打印
//        System.out.println();
//
//        // 打印测试数据
//        for (Integer n : lists) {
//            System.out.print(n + " ");
//        }
//        System.out.println(getData());

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
