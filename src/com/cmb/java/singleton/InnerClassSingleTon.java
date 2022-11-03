package com.cmb.java.singleton;

/**
 *  用静态内部类实现单例模式
 */

public class InnerClassSingleTon {

    private static class SingleTonInstance{
        private static final InnerClassSingleTon innerClassSingleTon = new InnerClassSingleTon();
    }

    public static InnerClassSingleTon getInstance(){
        return SingleTonInstance.innerClassSingleTon;
    }

    private InnerClassSingleTon(){}

    public void SayHi(){
        System.out.println("InnerClassSingleTonTest.....");
    }

}

class InnerClassSingleTonTest{
    public static void main(String[] args) {

        InnerClassSingleTon innerClassSingleTon = InnerClassSingleTon.getInstance();

        innerClassSingleTon.SayHi();;

    }
}
