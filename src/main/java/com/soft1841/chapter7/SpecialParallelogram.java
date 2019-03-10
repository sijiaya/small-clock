package com.soft1841.chapter7;

/**
 * 定义特殊的四边形类
 * @author sijia
 * 2019.3.10
 */
public class SpecialParallelogram{
    public static void main(String[] args) {
        //接口进行向上转型操作
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond()};
        //遍历“画图形”接口类型的数组
        for (int i =0; i < images.length; i++){
            //调用draw()方法
            images[i].draw();
        }
    }
}
