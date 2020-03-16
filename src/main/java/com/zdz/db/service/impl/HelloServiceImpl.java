package com.zdz.db.service.impl;

import com.alibaba.fastjson.JSON;
import com.zdz.db.dao.TestMapper;
import com.zdz.db.model.Test;
import com.zdz.db.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author zhangdezhi
 * @date 2020-03-16
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    TestMapper testMapper;
    public void queryData(Integer id){
        Test test = testMapper.selectByPrimaryKey(id);
        System.out.println(JSON.toJSONString(test));
    }
}
