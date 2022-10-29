package com.cmb.java.error;

/**
 * 异常处理复习
 */

public class ExcepTest {
    public static void main(String[] args) {

        try{
            int a[] = new int[2];
            System.out.println("数组越界："+a[3]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Thrown"+e);
        }

    }
}
