package com.cmb.java.singleton;

public class SingleTonLazy {

    private static SingleTonLazy singleTonLazy;

    public static SingleTonLazy getInstance(){
        if (singleTonLazy==null){
            singleTonLazy = new SingleTonLazy();
        }
        return singleTonLazy;
    }

    private SingleTonLazy(){}

    public void SayHello(){
        System.out.println("Hello,I am SingleTon Lazy Mode");
    }

}

class SingleTonLazyTest{
    public static void main(String[] args) {
        SingleTonLazy singleTonLazy = SingleTonLazy.getInstance();
        singleTonLazy.SayHello();
    }
}
