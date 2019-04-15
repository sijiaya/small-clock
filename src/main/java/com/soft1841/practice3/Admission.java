package com.soft1841.practice3;

public class Admission {
    public static void main(String[] args) {
        System.out.println("球员进场.....");
        A a=new A();
        a.start();
        B b=new B();
        b.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 11; i++) {
            System.out.print("a"+ i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 11; i++) {
            System.out.print("b"+ i);
        }
    }
}