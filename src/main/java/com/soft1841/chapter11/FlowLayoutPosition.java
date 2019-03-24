package com.soft1841.chapter11;

import javax.swing.*;
import java.awt.*;

/**
 * 使用流布局管理器
 * 继承JFrame类，设置该窗体管理器为FlowLayout布局管理器
 */
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        //设置窗体标题
        setTitle("本窗体使用流布局管理器");
        Container c = getContentPane();
        //设置创立使用流布局管理器，使用组件右对齐，组件之间的水平、垂直间距为10像素
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        //在容器中循环添加10个按钮
        for (int i = 0;i<10;i++){
            c.add(new JButton("button" + i));
        }
        //设置窗体大小
        setSize(300,200);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
