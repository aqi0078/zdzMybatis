package com.zdz.db.service.impl;

import com.alibaba.fastjson.JSON;
import com.zdz.db.dao.TestMapper;
import com.zdz.db.dataInterceptor.appointTableName.AppointTableName;
import com.zdz.db.datasource.DataSourceType;
import com.zdz.db.datasource.aspect.DataSource;
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
//        Test test = testMapper.selectByPrimaryKey(id);
//        System.out.println(JSON.toJSONString(test));
    }
    public void test01test(){
        Test test = testMapper.selectByPrimaryKey(200);
        System.out.println(Thread.currentThread().getName()+":"+"test01test"+JSON.toJSONString(test));
    }
    public void test02test(){
        Test test = testMapper.selectByPrimaryKey(200);
        System.out.println(Thread.currentThread().getName()+":"+"test02test"+JSON.toJSONString(test));
    }
    @DataSource(DataSourceType.DataBaseType.TEST02)
    public void test03test(){
        test04test();
        AppointTableName yyyymm01Strategy=new AppointTableName();
        yyyymm01Strategy.setTableName("20200201");
        Test test = testMapper.selectByPrimaryKeyAnd(201,yyyymm01Strategy);
        System.out.println(Thread.currentThread().getName()+":"+"test03test"+JSON.toJSONString(test));
        test04test();
    }
    @DataSource
    public void test04test(){
        Test test = testMapper.selectByPrimaryKey(201);
        System.out.println(Thread.currentThread().getName()+":"+"test04test"+JSON.toJSONString(test));
    }

    /**
     * 自己类调自己方法aop失效
     */
    @DataSource
    public void test05test(){
        test03test();
        Test test = testMapper.selectByPrimaryKey(200);
        System.out.println(Thread.currentThread().getName()+":"+"test04test"+JSON.toJSONString(test));
    }
}
