package com.cmb.java.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        //create a LinkedList to contain Integer
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(12);
        integerLinkedList.add(34);
        integerLinkedList.add(45);
        Collections.sort(integerLinkedList);
        for (Integer in:integerLinkedList
             ) {
            System.out.println(in);
        }
        LinkedList<String> str = new LinkedList<>();
        str.add("Google");
        str.add("Runoob");
        str.add("TaoBao");
        str.add("WeiBo");

        str.add(4,"Test");

        for (String s:str
             ) {
            System.out.println(s);
        }

        System.out.println("************I am parting line**********");

        for (int size=str.size(), i=0;i < size; i++){
            System.out.println(str.get(i));
        }

    }
}
