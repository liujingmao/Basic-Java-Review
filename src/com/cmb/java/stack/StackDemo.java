package com.cmb.java.stack;

import java.util.Stack;

import static javafx.scene.input.KeyCode.T;

/**
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
 *
 * 堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。
 */

public class StackDemo {

    static void showPush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push("+a+")");
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        showPush(st,2);

    }
}
