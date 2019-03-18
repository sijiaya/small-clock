package com.soft1841.practice;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算两个Date的差值
 * @author sijia
 * 2019.3.18
 */

public class DateDifferentExample {
    public static void main(String[] args) throws ParseException {
        //分别定义起止时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String date1 = "2019-03-17 07:31:58";//天数
        String date2 = "2019-03-17 07:39:58";//小时
        String date3 = "2019-03-18 08:20:20";//分钟数
        String date4 = "2019-03-18 08:10:10";//秒数
        String stopTime = format.format(date);
        Date d1;
        Date d2;
        Date d3;
        Date d4;
        long diff = 0;
        long diff1 = 0;
        long diff2 = 0;
        long diff3 = 0;
        //通过SimpleDateFormat来把String类型的时间对象转化成Date类型的对象
        d1 = format.parse(date1);
        d2 = format.parse(stopTime);
        d3 = format.parse(date2);
        d4 = format.parse(date3);
        diff = d2.getTime()-d1.getTime();
        diff1 = d2.getTime()-d4.getTime();
        diff2 = d2.getTime()-d3.getTime();
        diff3 = d2.getTime()-d4.getTime();
        //将毫秒分别换算成秒、分、小时、天
        //long diffSeconds = diff1/ 1000;
        long diffMinutes = diff3 / (1000 * 60);
        long diffHours = diff2 / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 * 60 * 24);
        //输出
        System.out.println("当前时间：" +format.format(date));
        System.out.println(format.format(date)+"  刚刚" );
        System.out.println(date2+"  " + Math.abs(diffHours) + "小时前");
        System.out.println(date3+"  " + Math.abs(diffMinutes) + "分前");
        System.out.println(date1 +"  "+ Math.abs(diffDays) + "天前");
    }

}