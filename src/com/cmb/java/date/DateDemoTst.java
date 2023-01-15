package com.cmb.java.date;

import java.time.*;

/**
 * LocalDate
 * LocalTime
 * LocalDateTime
 * 它们的实例都是不可变的对象
 */

public class DateDemoTst {
    public static void main(String[] args) throws InterruptedException {

        LocalDateTime l = LocalDateTime.now();
        System.out.println("localDatetime:"+l);

        System.out.println("*****Parting Line *****");

        LocalDateTime o = LocalDateTime.of(2022,3,10,10,27);
        System.out.println("of:"+o);

        System.out.println("-------Parting Line------");

        LocalDateTime local1 = l.plusYears(2);
        System.out.println("PlusYearof2:"+local1);

        System.out.println("&&&&&&&&&Parting Line**********");

        int y = l.getYear();
        Month m = l.getMonth();
        int dayOfMonth = l.getDayOfMonth();
        DayOfWeek dayOfWeek = l.getDayOfWeek();
        int dayOfYear = l.getDayOfYear();

        System.out.println("Get Year through getYear This Method:"+y);
        System.out.println("Get Mon through getMonth:"+m);

        System.out.println("$$$$$$$$ Parting Ling **********");

        System.out.println("dayofMonth:"+dayOfMonth);
        System.out.println("dayOfWeek:"+dayOfWeek);
        System.out.println("dayOfWeek:"+dayOfYear);

        System.out.println("Print Instant**********");

        Instant ins = Instant.now();
        //美国时间
        System.out.println("Instance:"+ins);


        System.out.println("***** Print OffsetDateTime ******");
        OffsetDateTime os = ins.atOffset(ZoneOffset.ofHours(8));
        System.out.println("Print OffsetDateTime:"+os);

        Instant n1= Instant.now();
        Thread.sleep(1200);
        Instant n2 = Instant.now();
        Duration d = Duration.between(n1,n2);
        System.out.println("Duration:"+d);
        System.out.println("toMillis():"+d.toMillis());
        System.out.println("toString:"+d.toString());

        System.out.println("*******LocalTime*******");

        LocalTime l1 = LocalTime.now();
        Thread.sleep(1200);
        LocalTime l2 = LocalTime.now();
        Duration d1 = Duration.between(l1,l2);
        System.out.println("toMillils:" + d1);

        System.out.println("********* Print Period *********");

        LocalDate o1 = LocalDate.of(2023,1,15);
        LocalDate o2 = LocalDate.now();
        Period p = Period.between(o1,o2);
        System.out.println("Period:"+p);

        System.out.println("getYears:"+p.getYears());
        System.out.println("getMonths:"+p.getMonths());
        System.out.println("getDays:"+p.getDays());

    }
}
