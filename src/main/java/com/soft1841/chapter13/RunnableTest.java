package com.soft1841.chapter13;


//用Object类的子类实现Runnable接口
public class RunnableTest extends Object implements Runnable{
    private int count = 10;
    public void run() {
        while (true){
            //打印count变量
            System.out.print(count+"  ");
            if (--count==0){
                //使count变量自减，当自减为0时，退出循环
                break;
            }
        }
    }

    public static void main(String[] args) {
        //创建线程类的一个对象
        RunnableTest test = new RunnableTest();
        Thread thread = new Thread(test);
        //启动线程
        thread.start();
    }
}
