package com.cmb.java;

public class LoopTest {
    public static void main(String[] args) {
        int a = 0;
        while (true){
            System.out.println("a:"+a);
            a++;
            if (a>10){
                return;
            }
        }
    }
}
