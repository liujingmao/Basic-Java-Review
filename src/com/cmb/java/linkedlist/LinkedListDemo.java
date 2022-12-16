package com.cmb.java.linkedlist;

/**
 * /**
 *  * Compare ArrayList and Linked List
 *  *
 *  * ArrayList usage:
 *  * 1. Frequently Read or get some element
 *  * 2. Only add element or delete element at the end of List
 *  *
 *  * LinkedList usage
 *  * 1. 你需要通过循环迭代来访问列表中的某些元素。
 *  * 2. 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作
 *  */

import com.cmb.java.arraylist.Order;

import java.util.Collections;
import java.util.LinkedList;

/**
 * LinkedList 继承了 AbstractSequentialList 类。
 *
 * LinkedList 实现了 Queue 接口，可作为队列使用。
 *
 * LinkedList 实现了 List 接口，可进行列表的相关操作。
 *
 * LinkedList 实现了 Deque 接口，可作为队列使用。
 *
 * LinkedList 实现了 Cloneable 接口，可实现克隆。
 *
 * LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输
 *
 */


public class LinkedListDemo {

  //  LinkedList<Order> orderLinkedList = new LinkedList<>();

   // LinkedList<String> stringLinkedList = new LinkedList<>();

    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Google");
        stringLinkedList.add("Runoob");
        stringLinkedList.add("taobao");
        stringLinkedList.add("WeiBo");
        stringLinkedList.add("Apple");
        stringLinkedList.add("Bank");

        System.out.println("Before sorted");

        System.out.println(stringLinkedList);

        Collections.sort(stringLinkedList);

        System.out.println("After Sorted");

        System.out.println(stringLinkedList);

        stringLinkedList.add("NanXiong");
        stringLinkedList.addFirst("China");
        stringLinkedList.addLast("Because");

        for (String str:stringLinkedList
             ) {
            System.out.println(str);
        }

    }




}
