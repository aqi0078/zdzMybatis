package com.zdz.db.demo.test1;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/7
 */
@Slf4j
public class SyncInfoRejectedExecutionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        log.error("落库大批量失败报警");
    }
}
