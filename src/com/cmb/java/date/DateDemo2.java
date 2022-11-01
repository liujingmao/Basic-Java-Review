package com.cmb.java.date;

/**
 * 这个有点复杂呀
 * 遇到不会用就查一下使用方法
 */

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);

    }
}
