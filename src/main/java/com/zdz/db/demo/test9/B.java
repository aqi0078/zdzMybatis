package com.zdz.db.demo.test9;

import lombok.Data;

/**
 * @Description:
 * @Date: 2020/11/16
 */
@Data
public class B implements Cloneable{
    public B(){}
    public B(Integer b1 ,Integer b2,String b3){
        this(b1);
        this.b2=b2;
        this.b3=b3;
    }
    public B(Integer b1 ){
        this.b1=b1;}

    private Integer b1;
    private Integer b2;
    private String b3;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (B)super.clone();
    }

}
