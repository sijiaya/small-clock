package com.soft1841.chapter7;

/**
 * 设计一个商场的抽象类，先定义买东西的抽象方法，其他交给子类
 * @author sijia
 * 2019.3.10
 */

public abstract class Market {
    //商场名称
    public String name;
    //商品名称
    public String goods;
    //抽象方法，用来输出信息
    public abstract void shop();
}
