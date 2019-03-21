package com.soft1841.practice;

import java.util.Scanner;

/**
 * 枚举类型实例 p219
 * 对英文小写进行对照输出
 * @author sijia
 * 2019.3.21
 */
enum Week{
    Monday("星期一"),TuesDay("星期二"),Wednesday("星期三"),
    Thursday("星期四"),Friday("星期五"),
    Saturday("星期六"),Sunday("星期天");
    String weekName;

    //对weekName进行封装，定义枚举构造函数
    Week(String weekName){
        this.weekName = weekName;
    }

    //获取枚举常量对应的值
    public String getWeekName(){
        return weekName;
    }

    //定义一个静态方法,根据简写完成输出
    public static Week getResult(String input) {
    switch (input){
        case "mon":
            return Week.Monday;
        case "tue":
            return Week.TuesDay;
        case "wed":
            return Week.Wednesday;
        case "thu":
            return Week.Thursday;
        case "fri":
            return Week.Friday;
        case "sat":
            return Week.Saturday;
        case "sun":
            return Week.Sunday;
        default:
            return Week.Monday;
        }
    }
}
public class EnumSetTest {
    public static void main(String[] args) {
        System.out.println("——中英文星期对照表——");
        //获取枚举数组
        Week weekArray[] = Week.values();
        //用foreach循环遍历枚举数组
        for (Week w:weekArray
             ) {
            //输出枚举名称及对应中文
            System.out.println(w+"——"+ w.getWeekName());
        }
        System.out.print("\n请输入要查询的星期小写：");
        Scanner scanner = new Scanner(System.in);
        //获取输入的枚举值
        Week week = Week.getResult(scanner.next());
        switch (week){
            case Monday:
                System.out.println("MONDAY——"+week.getWeekName());
            break;
            case TuesDay:
                System.out.println("TUESDAY——" + week.getWeekName());
                break;
            case Wednesday:
                System.out.println("WEDNESDAY——" + week.getWeekName());
                break;
            case Thursday:
                System.out.println("THURSDAY——" + week.getWeekName());
                break;
            case Friday:
                System.out.println("FRIDAY——" + week.getWeekName());
                break;
            case Saturday:
                System.out.println("SATURDAY——" + week.getWeekName());
                break;
            case Sunday:
                System.out.println("SUNDAY——" + week.getWeekName());
                break;
            // 登录人的身份是“管理员”时，输出“管理员”的权限
            default:
                System.out.println("您的输入有误！");
                break;
        }
    }
}
