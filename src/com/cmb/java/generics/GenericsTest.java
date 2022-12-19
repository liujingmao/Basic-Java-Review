package com.cmb.java.generics;

/**
 *
 *  Java 泛型（generics）是 JDK 5 中引入的一个新特性, 泛型提供了编译时类型安全检测机制，
 *  该机制允许程序员在编译时检测到非法的类型。
 *
 * 泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数。
 *
 * 假定我们有这样一个需求：写一个排序方法，能够对整型数组、字符串数组甚至其他任何类型的数组进行排序，该如何实现？
 *
 * 答案是可以使用 Java 泛型。
 *
 * 使用 Java 泛型的概念，我们可以写一个泛型方法来对一个对象数组排序。然后，调用该泛型方法来对整型数组、浮点数数组、字符串数组等进行排序。
 *
 */

public class GenericsTest {

    public static <E> void printArray(E[] inputArray){
        //input element in array
        for (E e: inputArray){
            System.out.printf("%s ", e);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // create diff type array: integer,double and Char
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.99,3.45,9.9};
        Character[] charactersArray = {'c','d','E'};

        System.out.println("Print Inter Type Array");
        printArray(intArray);

        System.out.println("Print Double Type Array");
        printArray(doubleArray);

        System.out.println("Print Char Type Array");
        printArray(charactersArray);

        /**
         * 泛型方法
         * 你可以写一个泛型方法，该方法在调用时可以接收不同类型的参数。根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用。
         *
         * 下面是定义泛型方法的规则：
         *
         * 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的 <E>）。
         * 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
         * 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
         * 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像 int、double、char 等）。
         * java 中泛型标记符：
         *
         * E - Element (在集合中使用，因为集合中存放的是元素)
         * T - Type（Java 类）
         * K - Key（键）
         * V - Value（值）
         * N - Number（数值类型）
         * ？ - 表示不确定的 java 类型
         */





    }
}
