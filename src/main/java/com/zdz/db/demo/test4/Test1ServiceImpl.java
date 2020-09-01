package com.zdz.db.demo.test4;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/12
 */
public class Test1ServiceImpl implements TestService<Note> {
    @Override
    public Note getObj() {
        Note note=new Note();
        note.setI(10);
        System.out.println(note.getI());
        return note;
    }

    @Override
    public void getData(Note obj,Integer i) {
        obj.setI(obj.getI()+i);
        System.out.println(obj.getI());
    }

    @Override
    public void setInfo(Note obj) {
        System.out.println("obj:"+obj.getI());
    }
}
