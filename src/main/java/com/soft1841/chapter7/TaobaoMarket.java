package com.soft1841.chapter7;

/**
 * 子类，继承自Market抽象类，实现其中的shop()抽象方法
 * 具体什么商场,买什么东西
 */
public class TaobaoMarket extends Market{
    public void shop(){
        System.out.println(name + "网购" + goods);
    }
}
