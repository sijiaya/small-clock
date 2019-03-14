package com.soft1841.chapter6;



public class ExceptionHanding2 {
    public static void main(String[] args) {
        int[] x = {0,1,2,3};
        for (int i = 0;i<3;i+=2){
            try {
                System.out.println(x[i+2]/x[i]+x[i+1]);
            }catch (ArithmeticException e){
                System.out.println("error1");
            }catch (Exception e){
                System.out.println("error2");
            }
        }
    }
}
