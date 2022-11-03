package com.cmb.java.singleton;

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
