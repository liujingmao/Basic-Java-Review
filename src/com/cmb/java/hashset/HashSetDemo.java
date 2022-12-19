package com.cmb.java.hashset;

import java.util.HashSet;

/**
 * 1. implement function base on hashMap, repeat elements are not allowed
 * 2. null value
 * 3. unsafe thread
 * 4. implement set this Interface
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> strHashset = new HashSet<>();
        strHashset.add("Helloword");
        strHashset.add("A");
        strHashset.add("B");
        strHashset.add("C");
        strHashset.add("A");
        System.out.println(strHashset.size());
        for (String str:strHashset
             ) {
            System.out.println(str);
        }
        System.out.println(strHashset);
        System.out.println(strHashset.contains("D"));
        strHashset.clear();
        System.out.println(strHashset);
    }
}
