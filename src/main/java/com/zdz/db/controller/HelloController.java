package com.zdz.db.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdezhi
 * @date 2020-03-12
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello------";
    }
}
