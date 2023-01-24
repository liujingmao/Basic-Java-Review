package com.cmb.java;

public class HelleWorldTest {
    public static void main(String[] args) {
        System.out.println("This is Hello World Test");

        HelleWorldTest helleWorldTest = new HelleWorldTest();
        String result = helleWorldTest.printString("Java Programmer!!!!!");
        System.out.println("String Result:"+result);
    }

    public String printString(String str){
        return str;
    }
}
