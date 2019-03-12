package com.soft1841.practice;

import java.util.Random;

/**
 * 大乐透号码生成器(随机数)
 * @author sijia
 * 2019.3.12
 */
public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        //一重循环产生五组
        for (int i = 0;i <= 4; i++){
            //每一组号有前5组、后两组组成
            int[] arr1 = new int[5];
            int[] arr2 = new int[2];
            //产生前面5个随机数
            for (int j = 0; j < 5; j++){
                arr1[j] = random.nextInt(35)+1;
                ///去掉重复数字
                for (int k = 0; k < j; k++){
                    if (arr1[k] == arr1[j]){
                        j--;
                        break;
                    }
                }
            }
            //产生后面两个随机数
            for (int j = 0; j < 2; j++) {
                arr2[j] = random.nextInt(12) + 1;
                ///去掉重复数字
                for (int k = 0; k < j; k++) {
                    if (arr2[k] == arr2[j]) {
                        j--;
                        break;
                    }
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.print("   ");
            for (int j = 0; j < 2; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
                }
            }
        }
