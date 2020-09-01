package com.zdz.db.demo.test6;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/17
 */
public class TestA implements Runnable{

    public void stu(Thread thread){
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("======");
    }
}
