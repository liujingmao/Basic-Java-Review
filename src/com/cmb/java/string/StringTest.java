package com.cmb.java.string;

/**
 * String 复习
 * String：用final修饰，不可变
 * StringBuffer： 可变
 * StringBuilder：方法线程不安全，可变
 *
 */

public class StringTest {



    public static void main(String[] args) {

        String stra = "Test"; //public tool
        String strb = new String("Test");  // Heap

        System.out.println(stra.equals(strb)); //比较值
        System.out.println(stra==strb); //比较引用

        System.out.println(stra.concat(strb));
        System.out.println(stra.charAt(0));
        System.out.println(stra.indexOf("T"));
        System.out.println(stra.compareTo(strb));

    }

}
