package com.qi.objArry;

/**
 * 创建学生类，将三个学生对象放到数组中，最后遍历出来
 */
public class Main {

    public static void main(String[] args) {

        //创建学生数组
        Student[] students = new Student[3];

        //创建学生对象
        Student s1 = new Student("余罪",22);
        Student s2 = new Student("傅佬",40);
        Student s3 = new Student("粉仔",25);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("学生姓名为："+students[i].getName()+"----年龄为："+students[i].getAge());
        }


    }
}
