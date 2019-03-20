package com.soft1841.practice;


import java.util.ArrayList;
import java.util.List;

public class StarListTest {
    public static void main(String[] args) {
        List<Star> starList = new ArrayList<>();
        starList.add(new Star("乔丹","   飞人",30.1,6.2,5.3));
        starList.add(new Star("拉塞尔","指环王",15.1,22.5,4.3));
        starList.add(new Star("贾巴尔","天钩",24.6,11.2,3.6));
        starList.add(new Star("张伯伦","篮球皇帝",30.1,22.9,4.4));
        System.out.println("———————NBA历史十大巨星—————————");
        System.out.println("球员        绰号       得分       篮板       助攻");
        int len = starList.size();
        for (int i = 0;i<len ;i ++){
            System.out.print(starList.get(i).getPlayers() + "       " + starList.get(i).getNickname()+
            "       "+ starList.get(i).getScore() + "       " + starList.get(i).getRebounds()
                    + "     " + starList.get(i).getAssists());
            System.out.println();
        }
    }
}
