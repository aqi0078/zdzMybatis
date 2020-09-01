package com.zdz.db.demo.test4;

public interface TestService<T> {
    T getObj();
    void getData(T obj,Integer i);
    void setInfo(T obj);
}
