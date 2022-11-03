package com.cmb.java.singleton;

/**
 * Issue: getInstance 使用了synchroinized ，增加了同步开销，降低了程序的执行效率
 */

public class SingleTonWithDoubleCheck {

    //
    private static SingleTonWithDoubleCheck singleTonWithDoubleCheck;

    public synchronized static SingleTonWithDoubleCheck getInstance(){
        if (singleTonWithDoubleCheck == null){
            singleTonWithDoubleCheck = new SingleTonWithDoubleCheck();
        }
        return singleTonWithDoubleCheck;
    }

    private SingleTonWithDoubleCheck(){

    }

    public void SayHi(){
        System.out.println("This Is SingleTonWithDoubleCheck Test");
    }

}

class SingleTonWithDoubleCheckTest{
    public static void main(String[] args) {
       SingleTonWithDoubleCheck  singleTonWithDoubleCheck = SingleTonWithDoubleCheck.getInstance();
       singleTonWithDoubleCheck.SayHi();
    }


}
