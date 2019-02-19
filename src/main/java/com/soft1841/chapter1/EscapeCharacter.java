package com.soft1841.chapter1;

//在类中定义多个转义字符并输出

public class EscapeCharacter {
    public static void main(String[] args) {
        //反斜杠转义字符
        char c1 = '\\';
        //单引号转义字符
        char c2 = '\'';
        //双引号转义字符
        char c3 = '\"';
        //十六进制表示的字符
        char c4 = '\u2605';
        //八进制表示的字符
        char c5 = '\101';
        //制表符转义字符
        char c6 = '\t';
        //换行符转义字符
        char c7 = '\n';
        System.out.println("[" + c1 + "]");
        System.out.println("[" + c2 + "]");
        System.out.println("[" + c3 + "]");
        System.out.println("[" + c4 + "]");
        System.out.println("[" + c5 + "]");
        System.out.println("[" + c6 + "]");
        System.out.println("[" + c7 + "]");
    }
}
