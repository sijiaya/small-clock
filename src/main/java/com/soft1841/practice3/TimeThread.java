package com.soft1841.practice3;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 系统时间
 */
public class TimeThread extends Thread {
    private JLabel timeLabel;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }
    @Override
    public void run() {
        while (true) {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            timeLabel.setText(String.valueOf(df.format(new Date())));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TimeThread timeThread = new TimeThread();
        timeThread.start();
    }
}
