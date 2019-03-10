package com.soft1841.chapter7;

/**
 * 子类，继承自Shape抽象类，实现其中的area()抽象方法
 */
public class Rectangular extends Shape {
    public void area() {
        System.out.println("矩形面积为：" + width*height);
    }
}
