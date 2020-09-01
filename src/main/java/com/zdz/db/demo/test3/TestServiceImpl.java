package com.zdz.db.demo.test3;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class TestServiceImpl implements Test<String> {
    @Override
    public String getData() {
        return "sssss";
    }

    @Override
    public void setInfo(String o) {
        System.out.println(o);
    }
}
