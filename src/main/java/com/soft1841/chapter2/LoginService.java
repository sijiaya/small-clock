package com.soft1841.chapter2;

/**
 * 用Boolean变量记录登录用户和密码
 */

import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {
        //创建扫描器，获取控制台输入的值
        Scanner sc = new Scanner(System.in);
        //输入提示
        System.out.println("请输入6位数字密码：");
        //将用户在控制台输入的数字赋给整型变量
        int password = sc.nextInt();
        //用逻辑运算符判断用户输入密码是否正确
        boolean result =  (password ==123456);
        //输出结果
        System.out.println("用户输入密码是否正确："+ result);
        //关闭扫描器
        sc.close();
    }
}
