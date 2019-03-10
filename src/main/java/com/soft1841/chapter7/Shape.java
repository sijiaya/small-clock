package com.soft1841.chapter7;

/**
 * 设计一个图形的抽象类,其他交给子类完成
 * @author sijia
 * 2019.3.10
 */
public abstract class Shape {
    //圆半径
    public double radius;
    //矩形宽度
    public double width;
    //矩形高度
    public double height;
    //抽象方法，用来输出信息
    public abstract void area();
}
