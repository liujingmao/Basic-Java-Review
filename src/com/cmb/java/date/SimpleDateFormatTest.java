package com.cmb.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  SimpleDateFormatTest
 *
 */

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        Date date  = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("Current Time Before Formated: "+ date.toString());

        System.out.println("Current Time After Formated is:"+ ft.format(date));

    }
}
