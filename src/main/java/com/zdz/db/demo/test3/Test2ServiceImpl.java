package com.zdz.db.demo.test3;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class Test2ServiceImpl implements Test<Integer> {
    @Override
    public Integer getData() {
        return 1;
    }

    @Override
    public void setInfo(Integer o) {
        System.out.println(o);
    }
}
