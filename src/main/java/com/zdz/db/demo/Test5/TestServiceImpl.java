package com.zdz.db.demo.Test5;

import java.util.List;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class TestServiceImpl implements TestService<Note>{


    @Override
    public Note convert(String str) {
        Note note=new Note();
        note.setStr(str);
        return note;
    }

    @Override
    public void execute(List<Note> list) {
        for (Note note:list) {
            System.out.println(note.getStr());
        }
    }
}
