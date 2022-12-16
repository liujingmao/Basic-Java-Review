package com.cmb.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

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
