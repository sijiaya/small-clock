package com.soft1841.practice;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Random;

public class Distance {
    public static void main(String[] args) throws IOException {
        int width = 1024;
        int height = 768;
        Random r = new Random();
        int x1 = r.nextInt(1024);
        int y1 = r.nextInt(768);
        int x2 = r.nextInt(1024);
        int y2 = r.nextInt(768);
        double dis = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        System.out.println("两点坐标为：( " + x1 + "," + y1 + " )  ，"+ " ( " + x2 + "," + y2 + " )");
        //表示保留几位小数: %.nf
        System.out.printf("两点间距离为"+"%.2f",Math.sqrt(dis));

        //开始用随即色值绘制图片
        //在图片缓冲区生成一个图片对象
        BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        g.fillRect(0,0,width,height);
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        g.setColor(Color.PINK);
        //设置图片背景
        g.setColor(Color.GRAY);
        g.fillRect(0,0,width,height);
        //更改画笔颜色
        g.setColor(Color.BLACK);
        //绘制线段
        g.drawLine(x1, y1, x2, y2);
        //写上线段长度
        g.setColor(Color.BLACK);
        NumberFormat numberFormat = NumberFormat.getInstance();
        String juli = numberFormat.format(Math.sqrt(dis));
        g.drawString( juli,(x1+x2)/2,(y1+y2)/2);
        //输出图片,本地文件的路径
        File file = new File("D:/dis.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写出到文件
        ImageIO.write(bufferedImage,"jpg", outputStream);
        //关闭输出流
        outputStream.close();
    }

}
