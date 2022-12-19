package com.cmb.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ava Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，
 * 可用于迭代 ArrayList 和 HashSet 等集合。
 *
 * Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
 */

public class RunoobTest {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> sites = new ArrayList<>();
        // STOPSHIP: 2022/12/19
        sites.add("Google");
        sites.add("Huawei");
        sites.add("TaoBao");
        sites.add("Zhihu");
        //get iterator
        Iterator<String> it = sites.iterator();
        // get first element
        System.out.println(it.next());
        System.out.println("*************Parting Line*******************");
        // 遍历all elements
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
