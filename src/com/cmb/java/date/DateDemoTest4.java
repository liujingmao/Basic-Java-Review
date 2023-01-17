package com.cmb.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateDemoTest4 {
    public static void main(String[] args) throws ParseException {

        ZoneId ame = ZoneId.of("America/New_York");
        LocalDateTime sh = LocalDateTime.now();
        LocalDateTime am = LocalDateTime.now(ame);
        System.out.println(sh);
        System.out.println(am);

        ZonedDateTime am2 = ZonedDateTime.now(ame);
        System.out.println(am2);

        String a1 = "2022-09-11 11:00:00";
        String a2 = "2022-09-12 13:25:00";

        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        Date d1 = s.parse(a1);
        Date d2 = s.parse(a2);

        long l1 = d1.getTime();
        long l2 = d2.getTime();

        long difT = Math.abs(l1 - l2);

        long difS = difT / 1000;

        long dif = difS / 60;

        long fDdis = dif / 60;

        long disM = dif % 60;

        System.out.println("时长为：" + fDdis + "h" + disM + "m");

        Instant it = Instant.now();
        Date d = Date.from(it);
        Instant it2 = d.toInstant();

        Date date2 = new Date();
        LocalDateTime ld2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());

        LocalDateTime l3 = LocalDateTime.now();
        Instant it3 = l3.atZone(ZoneId.systemDefault()).toInstant();
        Date d3 = Date.from(it);

        LocalDate l4 = LocalDate.now();
        Instant it4 = l4.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date d4 = Date.from(it);


    }
}
