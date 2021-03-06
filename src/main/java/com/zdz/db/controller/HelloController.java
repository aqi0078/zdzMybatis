package com.zdz.db.controller;

import com.zdz.db.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdezhi
 * @date 2020-03-12
 */
@Slf4j
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        helloService.queryData(200);
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                for (int i = 0; i < 100 ; i++) {
//                    helloService.test03test();
//                }
//            }
//        }.start();
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                for (int i = 0; i < 100 ; i++) {
//                    helloService.test04test();
//                }
//            }
//        }.start();
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                for (int i = 0; i < 100 ; i++) {
//                    helloService.test05test();
//                }
//            }
//        }.start();

        helloService.test03test();
        return "hello------";
    }
    @Value("${httpUrl}")
    private String httpUrl;
    @RequestMapping("/hello1")
    public String hello1(){
log.info("********************");
        return "hello------"+httpUrl;
    }
}
