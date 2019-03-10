package com.soft1841.chapter7;

/**
 * 在该类中使用Round类和Rectangular类创建抽象类对象，并分别给抽象类中的成员变量赋不同的值
 * 调用area()方法分别输出结果
 * @author sijia
 * 2019.3.10
 */
public class Calculate {
    public static void main(String[] args) {
        //使用派生类对象创建抽象类对象
        Shape shape = new Round();
        shape.radius = 2.0;
        shape.area();
        //使用派生类对象创建抽象类对象
        shape = new Rectangular();
        shape.height = 3.5;
        shape.width = 7.0;
        shape.area();
    }
}
