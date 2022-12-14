package com.cmb.java.generics;

/**
 * 有界的类型参数:
 *
 * 可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
 *
 * 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
 */

public class MaxnumTest {

    public static <T extends Comparable<T>> T maxinum(T x,T y,T z){

        T max = x;

        if (y.compareTo(max)>0){
            max = y;
        } if (z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.printf("%d,%d and %d Max Value: %d\n\n",3,4,5,maxinum(3,4,5));

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maxinum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maxinum( "pear", "apple", "orange" ) );

    }

}
