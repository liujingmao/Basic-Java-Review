package com.cmb.java.generics;

/**
 * 泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。
 *
 * 和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。
 * 一个泛型参数，也被称为一个类型变量，
 * 是用于指定一个泛型类型名称的标识符。
 * 因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。
 * @param <T>
 */

public class Box <T> {

    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return  t;
    }

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Test Flink"));

        System.out.printf("Integervalues: %d\n\n",integerBox.get());

        System.out.println("*********Parting Line********");

        System.out.printf("String value: %s\n", stringBox.get());

    }

}
