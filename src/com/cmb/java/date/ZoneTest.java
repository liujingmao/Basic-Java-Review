package com.cmb.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ZoneTest {
    public static void main(String[] args) throws ParseException {


        String stringDate = "2020-01-02 22:00:00";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//同一Date
        Date date = inputFormat.parse(stringDate);
//默认时区格式化输出：
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss Z]").format(date));
//纽约时区格式化输出
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        System.out.println(new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss Z]").format(date));






    }
}
