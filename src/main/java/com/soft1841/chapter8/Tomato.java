package com.soft1841.chapter8;

import java.util.Scanner;

/**
 * 完整的异常处理语句包含finally代码块
 * @author sijia
 * 2019.3.11
 */

//创建西红柿类
public class Tomato {
    public static void main(String[] args) {
        //创建控制台输出对象
        Scanner sc = new Scanner(System.in);
        //控制台输出提示信息
        System.out.println("今天的西红柿单价(单价格式为“3.00”): ");
        //把控制台输入的西红柿单价赋值给变量dayPrice
        String dayPrice = sc.next();
        //控制台输入的长度为4
        if (dayPrice.length() == 4){
            //把可能产生异常的代码放入try中
            try {
                //西红柿的售价信息
                String message = "西红柿：" + dayPrice + "元/500克";
                //使用": "拆分字符串
                String strArr[] = message.split(": ");
                //截取西红柿单价2.99
                String unitPriceStr = strArr[2].substring(0,4);
                //顾客购买西红柿的重量
                double weight = 650;
                //将string类型的西红柿单价转换为double类型
                double unitPriceDou = Double.parseDouble(unitPriceStr);
                //输出顾客买了650克西红柿需要支付的金额
                System.out.println(message + "，顾客买了" + weight + "克的西红柿，需支付"
                + (float)(weight/500 * unitPriceDou) + "元");
                //捕捉数组元素下标越界异常对象
            }catch (ArrayIndexOutOfBoundsException aiobe){
                aiobe.printStackTrace();
                //捕捉与已产生的异常类型相匹配的异常对象
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //关闭控制台输入对象
                sc.close();
                //输出提示信息
                System.out.println("控制台输出对象被关闭。");
            }
            //控制台输出的字符串长度不为4时
        }else {
            //输出提示信息
            System.out.println("违规操作：" + "输入西红柿单价时小数点后须保留两位有效数字（如3.00）！");
        }
    }
}
