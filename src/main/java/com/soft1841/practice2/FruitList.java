package com.soft1841.practice2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 实现comparable接口的fruit,放入list进行按价格排序
 * 2019.3.20
 */
public class FruitList {
    public static void main(String[] args) {
        //创建list对象，存入fruit对象
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("西瓜",15));
        list.add(new Fruit("芒果",7));
        list.add(new Fruit("榴莲",24));
        //调用collections的sort方法，会自动调用之前的compareTo方法进行排序
        Collections.sort(list);
        //用for循环遍历list
        for (Fruit fruit:list
             ) {System.out.println("水果："+fruit.getName()+"      价格："+fruit.getPrice());

        }

    }
}
