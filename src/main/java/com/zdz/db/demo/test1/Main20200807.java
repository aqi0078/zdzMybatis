package com.zdz.db.demo.test1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/7
 */
public class Main20200807 {

    //入库重试线程池
    private ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(2,2,60, TimeUnit.SECONDS,
            new ArrayBlockingQueue(100),new kafkaSyncInfoDefaultThreadFactory(),new SyncInfoRejectedExecutionHandler());
}
