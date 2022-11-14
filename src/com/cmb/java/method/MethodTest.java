package com.cmb.java.method;

/**
 * 在前面几个章节中我们经常使用到 System.out.println()，那么它是什么呢？
 *
 * println() 是一个方法。
 * System 是系统类。
 * out 是标准输出对象。
 * 这句话的用法是调用系统类 System 中的标准输出对象 out 中的方法 println()。
 * 那么什么是方法呢？
 * Java方法是语句的集合，它们在一起执行一个功能。
 *
 * 方法是解决一类问题的步骤的有序组合
 * 方法包含于类或对象中
 * 方法在程序中被创建，在其他地方被引用
 * 方法的优点
 * 1. 使程序变得更简短而清晰。
 * 2. 有利于程序维护。
 * 3. 可以提高程序开发的效率。
 * 4. 提高了代码的重用性。
 * 方法
 *
 */

public class MethodTest {

    int[] arr1={1,3,4,5,6,12,45,32,21,100,14};

    public int[] sourted(int[] a) {

        int[] b = new int[a.length];
        for (int i=0;i<a.length-1;i++){
            if (a[i]>a[i+1]){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] =t;
            } else {
                continue;
            }

            System.out.println("arra:"+ a[i]);
        }
        return a;
    }

    public double add(double a,double b){
        return a+b;
    }

    public static int max(int n1,int n2){
        int ret;
        if (n1>n2)
            ret = n1;
        else
            ret = n2;
        return ret;
    }

    public static int max2(int n1,int n2){
        return n1>n2?n1:n2;
    }

    public static void main(String[] args) {

       MethodTest methodTest = new MethodTest();

        /*double c = methodTest.add(1.2,3.4);

        System.out.println(c);

        int d = MethodTest.max(1,2);

        int res = MethodTest.max2(1,3);
        System.out.println("d:"+d);
        System.out.println("res:"+res);
        */


        int[] arr1={1,3,4,5,6,12,45,32,21,100,14};
        methodTest.sourted(arr1);
    }
}
