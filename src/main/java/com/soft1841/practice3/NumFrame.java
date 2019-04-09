package com.soft1841.practice3;


import javax.swing.*;
import java.awt.*;

public class NumFrame extends JFrame {
    //定义一个面板数组
    private JPanel[] panels;
    private JLabel leftLabel;
    private JLabel timeLabel;
    private JPanel colourPanel;

    public NumFrame(){
        init();
        setTitle("产生随机数");
        setSize(900, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        //设置容器
        Container container = getContentPane();
        //将容器设为网格布局
        container.setLayout(new GridLayout(2,5,10,10));
        //创建面板数组
        panels = new JPanel[7];

        //循环创建每个面板对象
        for (int i = 0; i < 7; i++) {
            panels[i] = new JPanel();
            //面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" +
                    (i + 1)));
            //面板依次加入网格布局管理器，变成九宫格
            add(panels[i]);
        }
        //1
        panels[0].setBackground(new Color(172, 72, 62));
        //2、设置第二个面板为BorderLayout边界布局，设置背景色
        panels[1].setBackground(new Color(24, 160, 94));
        //3
        panels[2].setBackground(new Color(255, 205, 66));
        //4
        panels[3].setBackground(new Color(74, 138, 244));
        //5
        panels[4].setBackground(new Color(225, 96, 21));
        //6
        panels[5].setBackground(new Color(63, 169, 208));
        //7
        panels[6].setBackground(new Color(202, 93, 108));
        leftLabel = new JLabel("随机数");
        container.add(leftLabel);
        Font font = new Font("微软雅黑",Font.BOLD,60);
        leftLabel.setFont(font);

        NumThread numThread = new NumThread();
        numThread.setLeftLabel(leftLabel);
        numThread.start();

        Font font2 = new Font("微软雅黑",Font.BOLD,15);
        timeLabel = new JLabel();
        timeLabel.setFont(font2);
        add(timeLabel);
        TimeThread timeThread = new TimeThread();
        timeThread.setTimeLabel(timeLabel);
        timeThread.start();

        colourPanel = new JPanel();
        add(colourPanel);
        ColourThread colourThread = new ColourThread();
        colourThread.setColourPanel(colourPanel);
        colourThread.start();
    }

    public static void main(String[] args) {
        new NumFrame();
    }

}
