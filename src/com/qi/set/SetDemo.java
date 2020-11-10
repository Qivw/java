package com.qi.set;

import java.util.HashSet;

/**
 * 自定义对象，添加到set集合并遍历
 */
public class SetDemo {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<Student>();

        Student s = new Student("lisi",12);
        Student s2 = new Student("zhangsan",12);
        Student s3 = new Student("zhangsan",12);

        set.add(s);
        set.add(s2);
        set.add(s3);

        for (Student stu:set) {
            System.out.println(stu);
        }
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写hashCode()方法
    @Override
    public int hashCode() {
        /*
        * 查看set.add()源码，发现先进行比较hashCode是否相同，如果不同直接添加
        * 如果相同，在比较((k = p.key) == key || (key != null && key.equals(k))))，不同添加
        * 相同不添加
        * */

        //现在利用比较hashcode是否相同，从而达到更快比较，提高代码效率
        //直接返回所有成员变量(基本数据类型直接相加，引用类型利用它本身的hashCode再相加（bool类型不可以参与运算）)
        return age + name.hashCode();
    }

    //重写equals()方法
    @Override
    public boolean equals(Object obj) {
        //System.out.println("1231231231");

        //提高效率
        if(this == obj){
            return true;
        }

        //提高健壮性
        if(this.getClass() != obj.getClass()){
            return false;
        }

        //向下转型
        Student stu = (Student)obj;
        //判断年龄是否相等
        if(this.age != stu.age)
            return false;
        //判断姓名是否一样
        if(!this.name.equals(stu.name))
            return false;
        //否则相等放回true
        return true;
    }
}
