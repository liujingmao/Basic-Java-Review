package com.cmb.java.date;

import java.util.Arrays;
import java.util.Date;

public class DateTestDemo {
    public static void main(String[] args) {
        // iniate Date Oject
        Date date = new Date();
        // use 'c' in get Full Date Info
       System.out.printf("Full Date Info: %tc%n",date);
       // use 'f'
        System.out.printf("Y-M-D %tF%n",date);
        // use 'D'
        System.out.printf("M/D/Y: %tD%n",date);
        //use 'r'
        System.out.printf("HH:MM:SS PM(12hour): %tr%n",date);
        // use 't'
        System.out.printf("HH:MM:SS (24hour): %tT%n",date);
        // use 'R'
        System.out.printf("HH:MM:SS (24hour): %tR",date);




    }
}
