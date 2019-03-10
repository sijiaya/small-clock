package com.soft1841.chapter7;

/**
 * 接口使用interface关键词，一个类实现一个接口用implements
 * 绘制特殊的平行四边形
 */

//定义“画图形”接口
interface DrawImage {
    //定义抽象方法“画”
    public void draw();
}
//矩形类实现一个drawTest接口
class Rectangle implements DrawImage{
    //矩形类实现draw()方法
    public void draw() {
        System.out.println("画矩形");
    }
}
//正方形类实现一个drawTest接口
class Square implements DrawImage{
    //正方类实现draw()方法
    public void draw() {
        System.out.println("画正方形");
    }
}
//菱形类实现一个drawTest接口
class Diamond implements DrawImage{
    //菱类实现draw()方法
    public void draw() {
        System.out.println("画菱形");
    }
}
