package com.zdz.db.demo.test4;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class Test2ServiceImpl implements TestService<String> {
    @Override
    public String getObj() {
        return "ssss";
    }

    @Override
    public void getData(String obj,Integer i) {
        System.out.println(obj);
    }

    @Override
    public void setInfo(String obj) {
        System.out.println("obj:"+obj);
    }
}
