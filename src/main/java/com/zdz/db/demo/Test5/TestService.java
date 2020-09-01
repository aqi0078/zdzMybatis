package com.zdz.db.demo.Test5;

import java.util.List;

public interface TestService<T> {
    T convert(String str);
    void execute(List<T> list);
}
