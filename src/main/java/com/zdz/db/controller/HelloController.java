package com.zdz.db.controller;

import com.zdz.db.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdezhi
 * @date 2020-03-12
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        helloService.queryData(200);
        return "hello------";
    }
}
