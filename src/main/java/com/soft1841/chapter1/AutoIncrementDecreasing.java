package com.soft1841.chapter1;

//变量实现自动增减服务
//对一个整型变量先做自增运算，再做自减运算
public class AutoIncrementDecreasing {
    public static void main(String[] args) {
        //创建整型变量a,初始值为1
        int a = 1;
        //输出此时a的值
        System.out.println("a = "+ a );
        a++;
        System.out.println("a++ = "+ a );
        a++;
        System.out.println("a++ = " + a );
        a++;
        System.out.println("a++ = " + a );
        a--;
        System.out.println("a-- = " + a );
    }
}
