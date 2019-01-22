package com.soft1841.chapter1;

public class BMIexponent {
    public static void main(String[] args) {
        //身高变量
        double height = 1.65;
        //体重变量
        int weight = 55;
        //BIM计算公式
        double exponent = weight / (height * height);
        System.out.println("您的身高是："+ height);
        System.out.println("您的体重为："+ weight);
        System.out.println("您的BMI指数为："+ exponent);
        System.out.println("您的体重属于：");
        //判断BIM指数是否小于18.5
        if (exponent < 18.5){
            System.out.println("体重过轻");
        }
        //判断BIM指数是否大于18.5在24.9之间
        if (exponent >= 18.5 && exponent < 24.9){
            System.out.print("正常范围");
        }
        //判断BIM指数是否大于18.5在29.9之间
        if (exponent >= 24.9 && exponent < 29.9){
            System.out.println("体重过轻");
        }
        //判断BIM指数是否大于29.9
        if (exponent >= 29.9){
            System.out.println("肥胖");
        }
    }
}
