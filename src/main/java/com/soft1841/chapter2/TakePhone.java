package com.soft1841.chapter2;

import java.util.Scanner;

/**
 * 判断手机号是否存在
 * 如果输入号码不是84972266，则提示拨打号码不存在
 */

public class TakePhone {
    public static void main(String[] args) {
        //创建Scanner对象，用于进行输入
        Scanner n = new Scanner(System.in);
        //输出提示
        System.out.println("请输入要拨打的号码：");
        //创建变量，保存号码
        int phoneNumber = n.nextInt();
        //判断号码是否正确
        if (phoneNumber != 84972266)
            System.out.println("对不起，您拨打的号码不存在");
    }
}
