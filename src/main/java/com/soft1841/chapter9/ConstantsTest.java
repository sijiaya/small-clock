package com.soft1841.chapter9;

//创建接口Constants
interface Constants{
    //在接口中定义两个int型的常量
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}

//在ConstantsTest类中定义:枚举类Constants2
public class ConstantsTest {
    //将接口Constants中的常量放置到枚举类Constants2中
    enum Constants2{
     Constants_A, Constants_B
    }

    //使用接口定义常量
    public static void doit(int c){   //定义一个方法，里面还有参数为int型
       //根据常量的值做不同的操作
        switch (c){
            case Constants.Constants_A:
                System.out.println(Constants.Constants_A);
                break;
            case Constants.Constants_B:
                System.out.println(Constants.Constants_B);
                break;
        }
    }
    //定义一个参数对象c为枚举类型的方法
    public static void doit2(Constants2 c){
        //根据枚举类型对象c做不同操作
        switch (c){
            case Constants_A:
                System.out.println(Constants2.Constants_A);
                break;
            case Constants_B:
                System.out.println(Constants2.Constants_B);
                break;
        }
    }

    public static void main(String[] args) {
        //使用接口定义的常量
        ConstantsTest.doit(Constants.Constants_A);
        ConstantsTest.doit(Constants.Constants_B);
        //使用枚举类型中定义的常量
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(3);
        //ConstantsTest.doit2(3); ——会报错是因为doit2()方法中的参数不是枚举类型的常量，枚举类型的常量都放在上面的enum中，只有那里写了这边才能输出
    }
}
