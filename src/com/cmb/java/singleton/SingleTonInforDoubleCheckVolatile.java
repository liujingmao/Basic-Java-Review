package com.cmb.java.singleton;

/**
 * 双重判断思想实现单例模式的设计
 */

public class SingleTonInforDoubleCheckVolatile {
    private static volatile SingleTonInforDoubleCheckVolatile singleTonInforDoubleCheckVolatile;

    private SingleTonInforDoubleCheckVolatile(){

    }

    public static SingleTonInforDoubleCheckVolatile getSingleTonInforDoubleCheckVolatile(){

        if (singleTonInforDoubleCheckVolatile==null){

           synchronized (SingleTonInforDoubleCheckVolatile.class){

               if (singleTonInforDoubleCheckVolatile==null){

                   singleTonInforDoubleCheckVolatile = new SingleTonInforDoubleCheckVolatile();
               }

           }

        }
        return singleTonInforDoubleCheckVolatile;
    }

    public void SayHi(){
        System.out.println("I am Volatile SingleTon");
    }


}

class SingleTonTest{
    public static void main(String[] args) {

       SingleTonInforDoubleCheckVolatile singleTonInforDoubleCheckVolatile = SingleTonInforDoubleCheckVolatile.getSingleTonInforDoubleCheckVolatile();

       singleTonInforDoubleCheckVolatile.SayHi();

    }
}
