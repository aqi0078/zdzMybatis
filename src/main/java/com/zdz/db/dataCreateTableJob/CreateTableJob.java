package com.zdz.db.dataCreateTableJob;

import com.zdz.db.dao.CreateTableMapper;
import com.zdz.db.redis.template.ListTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhangdezhi
 * @date 2020-03-26
 */
@Slf4j
@Component
public class CreateTableJob {
    @Autowired
    com.zdz.db.dao.CreateTableMapper createTableMapper;

    @Autowired
    ListTemplate listTemplate;
    @Scheduled(cron = "1 0/10 * * * ?")
//    @Async
    public void test() {
        String str=listTemplate.boundValueOps("packageName:com.mianfeinovel:data:2020-05-22:UserHelp:RankListCount").get();

        log.info("定时任务1:str:{}",str);
        listTemplate.delete("packageName:com.mianfeinovel:data:2020-05-21:UserHelp:RankListCount");
        listTemplate.delete("packageName:com.mianfeinovel:data:2020-05-22:UserHelp:RankListCount");
//        str=listTemplate.boundValueOps("packageName:com.mianfeinovel:data:2020-05-21:UserHelp:RankListCount").get();
//
//        log.info("定时任务1:str:{}",str);
        log.info("=======定时任务1:{}",Thread.currentThread().getName());
    }

//    @Scheduled(cron = " 0/10 * * * * ?")
////    @Async
//    public void test1() {
//        String str=listTemplate.boundValueOps("packageName:com.mianfeinovel:data:2020-05-21:UserHelp:RankListCount").get();
//
//        log.info("定时任务1:str:{}",str);
//        listTemplate.delete("packageName:com.mianfeinovel:data:2020-05-21:UserHelp:RankListCount");
//        listTemplate.delete("packageName:com.mianfeinovel:data:2020-05-22:UserHelp:RankListCount");
//        str=listTemplate.boundValueOps("packageName:com.mianfeinovel:data:2020-05-21:UserHelp:RankListCount").get();
//
//        log.info("定时任务1:str:{}",str);
//        log.info("=======定时任务1:{}",Thread.currentThread().getName());
//    }
//    @Scheduled(cron = "0/10 * 5 * * ?")
//    @Async
    public void pushDataScheduled1() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("定时任务1:{}",Thread.currentThread().getName());
        Map<String,String> map=createTableMapper.tableIsNull("test1");
        if (map==null){
            log.info("定时任务1:map==null");
        }else{
            log.info("定时任务1:map!=null");
        }
        if (map==null){
            int i=createTableMapper.createTest("test1");
            log.info("定时任务1:i=={}",i);
        }else{
            log.info("定时任务1:map!=null");
        }

        Map<String,String> map1=createTableMapper.tableIsNull("test1");
        if (map1==null){
            log.info("定时任务1:map1==null");
        }else{
            log.info("定时任务1:map1!=null");
        }
    }
}
