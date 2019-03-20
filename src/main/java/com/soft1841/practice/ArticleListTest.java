package com.soft1841.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleListTest {
    public static void main(String[] args) throws ParseException{
        List<Article> articleList = new ArrayList<>();
        //时间格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        articleList.add(new Article(1,"寻找前世之旅,人说今生的劫难往往都是前世种下的因，有因必有果","Vivibear",simpleDateFormat.parse("2019-03-10 09:45:13")));
        articleList.add(new Article(2, "最好的我们，你总是说青春从不曾走远，而那时候的年华，就是我们最美好的记忆。", "八月长安", simpleDateFormat.parse("2019-03-15 11:13:22")));
        articleList.add(new Article(2, "斗罗大陆，门外门弟子唐三，因偷学内门绝学为唐门所不容", "唐家三少", simpleDateFormat.parse("2019-3-18 22:18:07")));
        System.out.println("id    标题                       作者       时间");
        Iterator<Article> iterator = articleList.iterator();
        while (iterator.hasNext()){
            Article article = iterator.next();
            String result = timeCal(simpleDateFormat.format(article.getWriteTime()));
            System.out.println(article.getId() + "     " + article.getTitle().substring(0, 10) + "...   " +
                    article.getAuthor() + "    " + result);
        }
    }

    private static String timeCal(String time) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long diff = 0L;

            try {
                Date d1 = format.parse(time);
                Date now = new Date();
                diff = now.getTime() - d1.getTime();
            } catch (ParseException var13) {
                var13.printStackTrace();
            }

            long seconds = diff / 1000L;
            long minutes = seconds / 60L;
            long hours = minutes / 60L;
            long days = hours / 24L;
            if (seconds < 60L) {
                return "刚刚";
            } else if (minutes < 60L) {
                return minutes + "分钟前";
            } else {
                return hours < 24L ? hours + "小时前" : days + "天前";
            }
        }
}
