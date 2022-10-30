package com.cmb.java.struct.enumeration;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Java工具包提供了强大的数据结构。在Java中的数据结构主要包括以下几种接口和类：
 *
 * 枚举（Enumeration）
 * 位集合（BitSet）
 * 向量（Vector）
 * 栈（Stack）
 * 字典（Dictionary）
 * 哈希表（Hashtable）
 * 属性（Properties）
 */

public class EnumerationTest {

    public static void main(String[] args) {

        Enumeration<String> days;

        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wedesday");
        dayNames.add("ThuesDay");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        //加强for
        for (String d:dayNames){
            System.out.println(d);
        }

        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

    }

}
