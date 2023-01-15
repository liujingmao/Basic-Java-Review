package com.cmb.java.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateDemoTest {
    public static void main(String[] args) {

        LocalDate lDate = LocalDate.now();
        LocalTime lTime = LocalTime.now();

        ZonedDateTime zTime = ZonedDateTime.now();

        System.out.println("lDate:"+lDate);
        System.out.println("lTime:"+lTime);
        System.out.println("zTime:"+zTime);

        System.out.println("toString:"+zTime.toString());

        System.out.println("DateTimeFormatter:"+DateTimeFormatter.ISO_INSTANT.format(zTime));

        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("DateTimeFormatter's df:"+df.format(zTime));

        df = df.withLocale(Locale.US);
        System.out.println("new Df:"+df.format(zTime));






    }
}
