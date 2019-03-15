package com.soft1841.practice;
import cn.hutool.core.io.resource.ResourceUtil;
import com.sun.corba.se.spi.ior.iiop.IIOPFactories;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.util.resources.th.CalendarData_th;

import javax.xml.bind.SchemaOutputResolver;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

/**
 * 关于JDK8中的日期时间处理
 * @author sijia
 * 2019.3.15
 */

public class DateAndTime {
    public static void main(String[] args) {
        //获取今天的日期（不包含时间）
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date：" + today);

        //获取年、月、日信息
        LocalDate today1 = LocalDate.now();
        int year = today1.getYear();
        int month = today1.getMonthValue();
        int day = today1.getDayOfMonth();
        System.out.printf("Year : %d  Month : %d  day : %d t %n", year , month, day);

        //处理特定日期（需要传入年、月、日做参数）
        LocalDate dateOfBirth = LocalDate.of(2000,07,19);
        System.out.println("Your Date of birth is : " + dateOfBirth);

        //判断两个日期是否相等
        LocalDate date1 = LocalDate.of(2014,07,19);
        if (date1.equals(today)){
            System.out.printf("Today %s and date1 %s are same date %n", dateOfBirth,date1);
        }

        //检查像生日这种周期性事件(MonthDay类组合的是月、日)
        LocalDate dateOfBirth1 = LocalDate.of(2000,07,19);
        MonthDay birthday = MonthDay.of(dateOfBirth1.getMonth(), dateOfBirth1.getDayOfMonth());
        MonthDay currentMonthday = MonthDay.from(today1);
        if (currentMonthday.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else {
            System.out.println("Sorry, today is not your birthday");
        }

        //获取当前时间
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " +time);

        //如何在现有的时间增加小时
        LocalTime time1 = LocalTime.now();
        //增加了2个小时
        LocalTime newTime = time.plusHours(2);
        System.out.println("Time after 2 hours : " + newTime);

        //计算一周后的日期
        LocalDate nextWeek = today1.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is : " + today1);
        System.out.println("Date after 1 week : " +nextWeek);

        //计算一年前或一年后的日期
        LocalDate previousYear = today1.minus(1, YEARS);
        System.out.println("Date before 1 year : " + previousYear);
        LocalDate nextYear = today1.plus(1, YEARS);
        System.out.println("Date after 1 year : " +nextYear);

        //Clock时钟类（获取当前时区下的日期时间信息）
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock);
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + clock);

        //判断日期是早于还是晚于另一个日期
        LocalDate tomorrow = LocalDate.of(2019,3,16);
        if (tomorrow.isAfter(today1)){
            System.out.println("Tomorrow comes after today");
            LocalDate yesterday = today1.minus(1,DAYS);
            if (yesterday.isBefore(today1)){
                System.out.println("Yesterday is day before");
            }
        }

        //处理时区
        ZoneId america = ZoneId.of("America/New-York");
        LocalDateTime localDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateAndTime,america);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);

        //表示信用卡到期这类固定日期（用YearMonth）
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth , currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2019, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);

        //检查闰年
        if (today1.isLeapYear()){
            System.out.println("This year is Leap year");
        }else {
            System.out.println("2019 is not a Leap Year");
        }

        //计算两个日期之间的天数和月数
        LocalDate java8Release = LocalDate.of(2019,Month.MARCH, 15);
        Period periodToNextJavaRelease = Period.between(today1, java8Release);
        System.out.println("Months left between today and Java 8 release : "
        + periodToNextJavaRelease.getMonths());

        //包含时差信息的日期和时间
        LocalDateTime dateTime = LocalDateTime.of(2019,Month.JANUARY, 14, 19,30);
        ZoneOffset offset = ZoneOffset.of("+05:30");
        OffsetDateTime date = OffsetDateTime.of(dateTime, offset);
        System.out.println("Date and Time with timezone offset in Java : " + date);

        //获取当前的时间戳(时间戳里包含日期、时间)
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp);

        //使用预定义的格式化工具去解析或格式化日期
        String dayAfterTomorrow = "20190315";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n",dayAfterTomorrow,formatted);

        //使用自定义格式化工具解析日期
        String goodFriday = "Mar 15 2019";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
            System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday);
        }catch (DateTimeParseException ex){
            System.out.printf("%s is not parsable!%n", goodFriday);
            ex.printStackTrace();
        }

        //把日期实例转换为特定的字符串
        LocalDateTime arrivalDate = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at : %s %n", landing);
        }catch (DateTimeException ex){
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }

    }
}
