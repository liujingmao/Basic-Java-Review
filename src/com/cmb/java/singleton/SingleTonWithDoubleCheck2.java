package com.cmb.java.singleton;

/**
 *  SingleTonWithDoubleCheck2
 *  学习设计模式了
 */

public class SingleTonWithDoubleCheck2 {
    private static SingleTonWithDoubleCheck2 singleTonWithDoubleCheck2;
    public static SingleTonWithDoubleCheck2 getInstance(){

        if (singleTonWithDoubleCheck2==null){ //有线程非安全问题，如果两个线程同时执行到这里
            // 判断结果都为true时，他们都创建了对象，
            // 这和单例模式的设计思想是不符合的
            synchronized (SingleTonWithDoubleCheck2.class){
                singleTonWithDoubleCheck2 = new SingleTonWithDoubleCheck2();
            }
        }
        return singleTonWithDoubleCheck2;
    }
    private SingleTonWithDoubleCheck2(){}

    public void sayHi(){
        System.out.println("SingleTonWithDoubleCheck2 Test......");
    }
}

class SingleTonWithDoubleCheck2Test{
    public static void main(String[] args) {
        SingleTonWithDoubleCheck2 singleTonWithDoubleCheck2 = SingleTonWithDoubleCheck2.getInstance();
        singleTonWithDoubleCheck2.sayHi();
    }
}
