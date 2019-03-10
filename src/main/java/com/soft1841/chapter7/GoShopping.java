package com.soft1841.chapter7;

/**
 * 在该类中使用WallMarket类和TaobaoMarket类创建抽象类对象，并分别给抽象类中的成员变量赋不同的值
 * 调用shop()方法分别输出结果
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
