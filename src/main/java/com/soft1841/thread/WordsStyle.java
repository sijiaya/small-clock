package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;

public class WordsStyle extends Thread {
    // 文字标签
    private JLabel lblWords;


    // 以文字标签为参数的构造方法，利用构造方法初始化变量
    public WordsStyle(JLabel lblWords) {
        this.lblWords = lblWords;
    }

    @Override
    // 线程要执行的任务
    public void run() {
        // 使线程处于启用状态
        while (true) {
            try {
                // 线程休眠3秒
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 设置字体颜色，字体样式
            lblWords.setForeground(Color.BLUE);
            lblWords.setFont(new Font("方正舒体", Font.BOLD, 28));
            try {
                // 线程休眠2秒
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 设置字体颜色，字体样式
            lblWords.setForeground(Color.RED);
            lblWords.setFont(new Font("华文新魏", Font.BOLD | Font.ITALIC, 28));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 设置字体颜色，字体样式
            lblWords.setForeground(Color.GREEN);
            lblWords.setFont(new Font("华文隶书", Font.ITALIC, 28));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 设置字体颜色，字体样式
            lblWords.setForeground(Color.BLACK);
            lblWords.setFont(new Font("华文行楷", Font.PLAIN, 28));
        }
    }
}
