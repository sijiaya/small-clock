package com.soft1841.chapter1;

import java.awt.*;

//使用位移运算符对密码加密
//声明一个整型变量用于保存原密码，再声明另一个整型变量当做加密参数，原密码与加密参数进行运算左移会生成一个新数字，新数字再与加密参数进行右移运算则会还原回原来的密码
public class BitwiseOperator {
    public static void main(String[] args) {
        //原密码
        int password = 751248;
        //加密参数
        int key = 7;
        //输出结果
        System.out.println("原密码：" + password);
        //将原密码左移，生成新数字
        password = password << key;
        System.out.println("经过左移运算加密后的结果：" + password);
        //将原密码右移，还原回原来的数字
        password = password >> key;
        System.out.println("经过右移运算加密后的结果：" + password);
    }
}
