package com.soft1841.chapter1;

import java.util.Scanner;

/**
 * 让用户输入两个数字，分别用5种运算符对这两个数字进行计算
 */

public class ArithmeticOperator {
    public static void main(String[] args) {
        //创建扫描器，获取控制台输入的值
        Scanner sc = new Scanner(System.in);
        //输出提示
        System.out.println("请输入这两个数字，用空格隔开(num1 num2)：");
        //记录输入的第一个数字
        double num1 = sc.nextDouble();
        //记录输入的第二个数字
        double num2 = sc.nextDouble();
        System.out.println("num1+num2的和为：" + (num1+num2));
        System.out.println("num1-num2的差为：" + (num1-num2));
        System.out.println("num1*num2的乘为：" + (num1*num2));
        System.out.println("num1/num2的商为：" + (num1/num2));
        System.out.println("num1%num2的余数为：" + (num1%num2));
    }
}
