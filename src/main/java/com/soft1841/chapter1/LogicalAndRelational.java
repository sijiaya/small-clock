package com.soft1841.chapter1;

//利用逻辑运算符和关系运算符进行运算
//首先利用关系运算符计算出布尔结果，再用逻辑运算符做二次计算
public class LogicalAndRelational {
    public static void main(String[] args) {
        //声明int型变量a,b
        int a = 2;
        int b = 5;
        //声明boolean型变量，用于保存应用逻辑运算符“&&”“||”后的返回值
        boolean result = ((a > b) && (a != b ));
        boolean result2 = ((a > b) || (a != b ));
        System.out.println(result);
        System.out.println(result2);
    }
}
