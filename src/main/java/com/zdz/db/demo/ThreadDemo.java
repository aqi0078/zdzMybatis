package com.zdz.db.demo;

import com.zdz.db.model.AccountInfo;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/7
 */
public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName()+"======thread=======");
        }
        AccountInfo accountInfo =new AccountInfo();
        
        System.out.println(Thread.currentThread().getName()+"===1111111===thread=======");
    }
}
