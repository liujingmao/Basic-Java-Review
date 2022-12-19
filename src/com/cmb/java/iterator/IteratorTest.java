package com.cmb.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 */

public class IteratorTest {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(45);
        numbers.add(12);
        numbers.add(23);
        numbers.add(19);
        numbers.add(5);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if (i>20){
                it.remove();
            }
        }
        System.out.println(numbers);

        System.out.println("******Parting Line********");

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
