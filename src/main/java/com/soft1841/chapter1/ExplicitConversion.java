package com.soft1841.chapter1;

/**
 * 显示转换（强制转换）    (类型名)要转换的值
 * 利用显示转换实现精度丢失(将不同类型的变量转换成精度更低的类型，输出转换之后发生精度丢失的结果)
 */

public class ExplicitConversion {
    public static void main(String[] args) {
        //double类型强制转换成int类型
        int a = (int) 45.23;
        //float类型强制转换成long类型
        long b = (long) 456.6f;
        //double类型强制转换成char类型
        char c = (char) 97.14;
        System.out.println("45.23强制转换成int类型的结果：" + a);
        System.out.println("456.6f强制转换成long类型的结果：" + b);
        System.out.println("97.14强制转换成char类型的结果：" + c);
    }
}
