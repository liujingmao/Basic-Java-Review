package com.cmb.java.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneTest2 {

    public static void main(String[] args) {

        // 一个时间表示
        String strDate = "2023-01-19 22:00:00";
        //初始化三个时区
        ZoneId timeZoneSH = ZoneId.of("Asia/Shanghai");
        ZoneId timeZoneNY = ZoneId.of("America/New_York");
        ZoneId timeZoneJST = ZoneOffset.ofHours(9);

        //格式化器
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZonedDateTime date = ZonedDateTime
                .of(LocalDateTime.parse(strDate,dateTimeFormatter),timeZoneJST);
        //

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");

        System.out.println("Time SH:"+timeZoneSH.getId()+
                outputFormat.withZone(timeZoneSH).format(date));

        System.out.println("Time NY:"+timeZoneNY.getId()
                +outputFormat.withZone(timeZoneNY).format(date));

        System.out.println("JST Time:"+timeZoneJST.getId()+
                outputFormat.withZone(timeZoneJST).format(date));


    }
}
