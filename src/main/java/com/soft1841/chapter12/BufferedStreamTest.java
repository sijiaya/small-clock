package com.soft1841.chapter12;


import java.io.*;

/**
 * 以字节为单位进行输入/输出
 * @author  sijia
 * 2019.4.3
 */
public class BufferedStreamTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"你不喜欢我，我一点都不介意。因为我活下来，不是为了取悦你！"};
        //创建文件对象
        File file = new File("E:\\word.txt");
        //创建字节输出流对象
        FileOutputStream fos = null;
        //创建带缓冲的输出流对象
        BufferedOutputStream bos = null;
        //创建字节输入流对象
        FileInputStream fis = null;
        //创建带缓冲的输入流对象
        BufferedInputStream bis = null;
        try {
            //1.实例化FileOutputStream对象
            fos = new FileOutputStream(file);
            //实例化BufferedOutputStream对象
            bos = new BufferedOutputStream(fos);
            //创建可容纳1024个字节数的缓冲区
            byte[] bContent = new byte[1024];
            //循环遍历数组
            for (int k = 0; k<content.length;k++){
                //将遍历到的数组内容转换为字节数组
                bContent = content[k].getBytes();
                //将字节数组写入到文件
                bos.write(bContent);
            }
            System.out.println("写入成功！\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //将BufferedOutputStream流关闭
                bos.close();
                //将FileOutputStream流关闭
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            //2.实例化FileInputStream对象
            fis = new FileInputStream(file);
            //实例化BufferedInputStream对象
            bis = new BufferedInputStream(fis);
            //创建byte数组，用来存储读取到的内容
            byte[] bContent = new byte[1024];
            //从文件中读取信息，并存入到字节数组中
            int len = bis.read(bContent);
            //输出文件数据
            System.out.println("文件的信息是："+new String(bContent,0,len));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //将BufferedInputStream流关闭
                bis.close();
                //将FileInputStream流关闭
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

