package com.qi.Interface;

/**
 * 1.接口中的方法都是抽象方法
 * 2.接口中的方法默认都是被 public abstract 修饰的
 * 3.接口中的方法只能被 public 修饰
 *
 * 4.接口中都是常量
 * 5.接口中的变量都是默认被final static 修饰的
 */
public class InterfaceDemo {

    public static void main(String[] args) {

        int s = Animal.num;
    }
}


interface Animal {

    //int num;
    int num = 15;
    final int s = 13;
    final static int a = 12;

    public abstract void eat();
    public void niu();
    void sleep();
    //private void drink();
}