package com.cmb.java;

/**
 *  for Loop Test
 *  tow method to implement loop operation with 'for'
 *  复习java 基础知识
 */

public class ForLoopTest {
    public static void main(String[] args) {

        String str[] ={"Java","String","Bigdata","Spark","Hadoop","Flink"};

        //加强for
        for (String s:str){
            System.out.println("s:"+s);
        }

        System.out.println();
        // 传统for
        for (int i=0;i<str.length;i++){
            System.out.println("数组str第"+(i+1)+"个元素是："+str[i]);
        }
    }
}
