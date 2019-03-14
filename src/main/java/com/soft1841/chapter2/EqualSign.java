package com.soft1841.chapter2;

/**
 * 使用赋值运算符为变量赋值
 */

//创建类
public class EqualSign {
    //主方法
    public static void main(String[] args) {
        //声明整型变量a,b,c
        int a,b,c = 11;
        //将32赋给变量a
        a = 32;
        //将a+4的和赋值给变量b，再赋值给变量c
        c = b = a + 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
