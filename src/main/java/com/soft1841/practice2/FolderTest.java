package com.soft1841.practice2;

import java.io.File;

/**
 * 遍历文件夹（获取指定文件夹下的照片）
 * 2019.04.01
 */
public class FolderTest {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "D:\\image";
        //获取其file对象
        File file = new File(path);
        //遍历path下的文件和目录，仿制file数组中
        File[] files = file.listFiles();
        for (File f:files) {
            if (!f.isDirectory()){
                String srcFileName = f.getName();
                int position = srcFileName.indexOf(".");
                String suffixName = srcFileName.substring(position);
                //判断后缀名
                if (suffixName.equals(".jpg")||suffixName.equals(".png")){
                    System.out.println(f);
                }
            }
        }
    }
}
