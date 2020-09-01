package com.zdz.db.demo.test6;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/18
 */
@Data
@RequiredArgsConstructor
public class BB {
    private final String str;
    private int i;

//    public BB(String str,int i){
//        this.str=str;
//        this.i=i;
//    }
    public void abc(){
        Thread thread=new Thread(this::run);
        thread.start();
    }
    private void run(){
        System.out.println("-------=====");
    }
}
