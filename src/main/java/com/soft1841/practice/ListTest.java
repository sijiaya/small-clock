package com.soft1841.practice;


import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口练习
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*list.size());
        System.out.println("随机获取集合的元素:" + list.get(i));
        list.remove(2);
        for (int j = 0;i < list.size();i++){
            System.out.println(list.get(j));
        }
    }
}
