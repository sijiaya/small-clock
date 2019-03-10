package com.soft1841.chapter7;

public class Elves implements Removable,CanSing {
    //可唱歌类中实现sing()方法
    public void sing() {
        System.out.println("可唱歌");
    }

    //可移动类中实现remove()方法
    public void remove() {
        System.out.println("可移动");
    }

    public static void main(String[] args) {
        Elves elves = new Elves();
        System.out.println("精灵：");
        //子类对象调用Removable,CanSing两个接口被实现的所有方法
        elves.remove();
        elves.sing();
    }
}
