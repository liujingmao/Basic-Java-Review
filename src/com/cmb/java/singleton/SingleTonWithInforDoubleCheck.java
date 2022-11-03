package com.cmb.java.singleton;

/*

 这个有个隐藏的问题：new SingleTonWithInforDoubleCheck的时候，
 会触发底层cpu的指令重排序，导致
 程序的不确定性，为了防止cpu指令的重排序，应该给
 SingleTonWithInforDoubleCheck 前面加 volatile

 */

public class SingleTonWithInforDoubleCheck {
    private static SingleTonWithInforDoubleCheck singleTonWithInforDoubleCheck;
    private SingleTonWithInforDoubleCheck(){}
    public static SingleTonWithInforDoubleCheck getInstance(){
        if (singleTonWithInforDoubleCheck==null){
            synchronized (SingleTonWithInforDoubleCheck.class){
                if (singleTonWithInforDoubleCheck==null){
                    singleTonWithInforDoubleCheck = new SingleTonWithInforDoubleCheck();
                }
            }
        }
     return singleTonWithInforDoubleCheck;
    }
    public void SayHi(){
        System.out.println("I am SingleTonWithInforDoubleCheck Test..... ");
    }
}

class SingleTonWithInforDoubleCheckTest{
    public static void main(String[] args) {

        SingleTonWithInforDoubleCheck singleTonWithInforDoubleCheck = SingleTonWithInforDoubleCheck.getInstance();
        singleTonWithInforDoubleCheck.SayHi();

    }
}
