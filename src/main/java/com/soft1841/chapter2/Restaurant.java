package com.soft1841.chapter2;


//引入Scanner
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        //创建扫描机，获取控制台输入的值
        Scanner scanner = new Scanner(System.in);
        //输出提示
        System.out.println("欢迎光临，请问有多少位用餐？");
        //记录用户输入的用餐人数
        int count = scanner.nextInt();
        //如果人数少于4人
        if (count <= 4 ) {
            System.out.println("客人请到大厅4人桌用餐");
            //如果人数4到8人之间
        }else if (count > 4 && count <= 8){
            System.out.println("客人请到大厅8人桌用餐");
            //如果人数8到16人之间
        }else if (count > 8 && count <= 16){
            System.out.println("客人请到楼上包厢用餐");
        }else {
            //当以上条件都不成立时执行的语句块
            System.out.println("抱歉，本店暂时没这么大的包厢");
        }
        //关闭扫描机
        scanner.close();
    }
}
