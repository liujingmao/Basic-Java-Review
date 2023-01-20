package com.cmb.java;

public class App {

    public static void main(String[] args) {

        //传统写法
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("这是匿名内部内输出");
            }
        };

        // lambda expression
        Runnable runnable1 = ()-> System.out.println("Lambda Expression OutPut...");
        runnable.run();
        System.out.println("********Parting Line*******");
        runnable1.run();
    }

}
