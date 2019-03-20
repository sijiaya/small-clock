package com.soft1841.practice2;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(06, "郭瑞昌"));
        list1.add(new Student(26, "张攀华"));
        list2.add(new Student(30, "亢悦昕"));
        list2.add(new Student(36, "姚思佳"));
        System.out.println("———按性别输出的结果———");
        //创建Map集合对象
        Map<String,List<Student>> map = new HashMap<>();
        map.put("男生",list1);
        map.put("女生",list2);
        //迭代
        Iterator<Map.Entry<String,List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            List<Student> list = entry.getValue();

            /*for (Student s : list){
                System.out.print(s.getId()+ "  " + s.getName());
                System.out.println();
            }*/

          //Lambda遍历内层
         list.forEach(student -> {
             System.out.print(student.getId()+"\t"+student.getName());
             System.out.println();
         });
        }
    }
}