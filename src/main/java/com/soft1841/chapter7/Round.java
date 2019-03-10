package com.soft1841.chapter7;

/**
 * 子类，继承自Shape抽象类，实现其中的area()抽象方法
 */
public class Round extends Shape{
    public void area() {
        System.out.println("圆形面积为：" + radius*radius*3.14);
    }
}
