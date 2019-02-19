package com.soft1841.chapter1;

//对用户输入的值进行比较
//记录用户输入的两个数，分别用各个关系运算符来计算这两个数间的关系

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        //创建扫描器，获取控制器输入的值
        Scanner sc = new Scanner(System.in);
        //输出提示
        System.out.println("请输入两个整数，用空格隔开(num1 num2)：");
        //记录输入的第一个数和第二个数
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //输入结果
        System.out.println("num1<num2的结果：" + (num1 < num2));
        System.out.println("num1>num2的结果：" + (num1 > num2));
        System.out.println("num1==num2的结果：" + (num1 == num2));
        System.out.println("num1!=num2的结果：" + (num1 != num2));
        System.out.println("num1<=num2的结果：" + (num1 <= num2));
        System.out.println("num1>=num2的结果："+ (num1>=num2));
    }
}
