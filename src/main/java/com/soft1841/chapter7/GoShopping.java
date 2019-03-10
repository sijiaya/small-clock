package com.soft1841.chapter7;

/**
 * 子类，继承自Market抽象类，实现其中的shop()抽象方法
 * 具体什么商场,买什么东西
 * @author sijia
 * 2019.3.10
 */
public class GoShopping {
    public static void main(String[] args) {
        //使用派生类对象创建抽象类对象
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        //使用派生类对象创建抽象类对象
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
