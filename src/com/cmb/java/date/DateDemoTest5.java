package com.cmb.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 一是，Date 并无时区问题，世界上任何一台计算机使用 new Date() 初始化得到的时间都一样。因为，Date 中保存的是 UTC 时间，UTC 是以原子钟为基础的统一时间，不以太阳参照计时，并无时区划分。
 * 二是，Date 中保存的是一个时间戳，代表的是从 1970 年 1 月 1 日 0 点（Epoch 时间）到现在的毫秒数。尝试输出 Date(0)
 */

public class DateDemoTest5 {
    public static void main(String[] args) throws ParseException {

        Date date = new Date(2023,1,19,11,12,14);
        System.out.println("Date:"+date);

        Date date1 = new Date(2023-1900,11,31,11,12,13);
        System.out.println("Data1:"+date1);

        System.out.println("Print original Atomic time:"+new Date(0));

        System.out.println(TimeZone.getDefault().getID()+":"+
                TimeZone.getDefault().getRawOffset()/3600000);

        String stringDate = "2020-01-02 22:00:00";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //默认时区解析
        Date date2 = inputFormat.parse(stringDate);
        System.out.println("Date2:"+date2+":"+date2.getTime());

        inputFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        Date date3 = inputFormat.parse(stringDate);
        System.out.println("Date3:"+date3+":"+date3.getTime());


    }
}
