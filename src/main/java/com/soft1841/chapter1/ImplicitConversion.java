package com.soft1841.chapter1;


//隐式转换      自动提升双精度
//让低精度的变量与高精度变量同时做计算，查看结果属于哪种精度
public class ImplicitConversion {
    public static void main(String[] args) {
        //声明byte型变量mybyte，并把byte型变量允许的最大值赋给mybyte
        byte mybyte = 127;
        //声明int型变量myint,并赋值
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println("byte型与float型数据进行运算结果为：" + (mybyte + myfloat));
        System.out.println("byte型与int型数据进行运算结果为：" + mybyte * myint);
        System.out.println("byte型与char型数据进行运算结果为：" + mybyte / mychar);
        System.out.println("double型与char型数据进行运算结果为：" + (mydouble + mychar));


        //使用int型变量为float型变量赋值，此时int型变量将隐式转换为float型变量

        //声明int型变量x
        int x = 50;
        //将x赋值给y
        float y = x;
        System.out.println(y);
        //如果float和int交换了位置，就会弹出“floa无法转变成int值”
    }
}
