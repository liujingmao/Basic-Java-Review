package com.cmb.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Compare ArrayList and Linked List
 *
 * ArrayList usage:
 * 1. Frequently Read or get some element
 * 2. Only add element or delete element at the end of List
 *
 * LinkedList usage
 * 1. 你需要通过循环迭代来访问列表中的某些元素。
 * 2. 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作
 */

public class RunobTest {
    public static void main(String[] args) {
        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("a");
        strlist.add("b");
        strlist.add("TabBao");
        strlist.add("Wiki");
        strlist.add("Runnoob");
        Collections.sort(strlist);

        for (String t: strlist
             ) {
            System.out.println(t);
        }

        System.out.println();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(23);
        integers.add(45);
        integers.add(14);
        Collections.sort(integers);
        for (Integer in:integers
             ) {
            System.out.println(in);
        }

        integers.clear();
        System.out.println("integers's size is:"+integers.size());

        if (integers.isEmpty()){
            System.out.println("Ingter Arraylist has Be clear");
        }  else {
            System.out.println("Please clear ArrayList");
        }

    }
}
