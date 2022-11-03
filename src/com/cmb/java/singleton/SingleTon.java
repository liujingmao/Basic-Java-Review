package com.cmb.java.singleton;

/*
饿汉式，
单例模式，减少内存开销，提高线程运行效率
 */

public class SingleTon {

    /**
     *  Earger man , early create an instance
     */
    private static SingleTon instance = new SingleTon();

    public static SingleTon getInstance() {
        return instance;
    }

    public SingleTon(){}

    public void SayHello(){
        System.out.println("Hello,SingleTon");
    }
}

class SingletonTest{
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        singleTon.SayHello();
    }
}
