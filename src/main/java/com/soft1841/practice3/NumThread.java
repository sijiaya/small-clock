package com.soft1841.practice3;



import javax.swing.*;

import java.util.Random;

/**
 * 随机数线程
 */
public class NumThread extends Thread {
    private JLabel leftLabel;

    public void setLeftLabel(JLabel leftLabel) {
        this.leftLabel = leftLabel;
    }


    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100);
            leftLabel.setText(String.valueOf(num));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        numThread.start();
    }
}