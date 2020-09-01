package com.zdz.db.demo.test6;

/**
 * @Author: dezhi
 * @Description:
 * @Date: 2020/8/17
 */
public class TestMain {

    public enum Test{
        stat;
        private Thread thread;
        public void ttt(){
            Thread t=new Thread();
            this.thread=t;
        }
        public Thread getThread(){
            return this.thread;
        }
    }


    public static void main(String[] args) {
        System.out.println(Test.stat.getThread());
        Test.stat.ttt();
        System.out.println(Test.stat.getThread());
        TestService testService=new TestServiceImpl();
        try {

        }catch (Exception e){

        }

        Enum e1= TestService.getEnum();
        System.out.println(e1);
        System.out.println(TestService.getEnum());
    }
}
