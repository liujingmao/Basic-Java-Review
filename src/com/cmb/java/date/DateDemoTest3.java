package com.cmb.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 *  DateDemo Learn
 */
public class DateDemoTest3 {
    public static void main(String[] args) throws ParseException {
        String s1 = "2022-06-15 11:00:00";
        String s2 = "2022-02-15 15:12:00";
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date d1 = s.parse(s1);
        Date d2 = s.parse(s2);
        System.out.println("d1:"+d1);
        System.out.println("d2:"+d2);
        long l1 = d1.getTime();
        long l2 = d2.getTime();
        long dt = Math.abs(l1-l2);
        System.out.println("dt:"+dt);
        long ds = dt/1000;
        long dm = ds/60;

        long dh = dm /60;
        long dms = dm % 60;

        System.out.println("Sum Time:"+dh+"H,"+dms+"s");

        //Print Today

        System.out.println("**********Parting Line*********");

        LocalDate today = LocalDate.now();
        System.out.println("Today is:"+today);

        LocalDate fD = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstDayofYear = today.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("fD:"+fD);
        System.out.println("firstDayofYear:"+firstDayofYear);

        System.out.println("********Parting Line********");

        LocalDate f2 = today.withDayOfMonth(2);
        System.out.println("f2:"+f2);

        LocalDate zuihou = today.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate zuihou2 = LocalDate.of(2023,2,15).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("zuihou:"+zuihou2);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow is :"+ tomorrow);

        boolean isL = tomorrow.isLeapYear();
        System.out.println("isLeapYear:"+isL);

        LocalTime xianz2 = LocalTime.now().withNano(0);
        System.out.println("xian2:"+xianz2);

        LocalTime tm = LocalTime.of(13,12,25);
        System.out.println("tm:"+tm);

    }
}
