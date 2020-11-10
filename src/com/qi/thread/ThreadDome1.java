package com.qi.thread;

/**
 * 多线程实现方式一
 */
public class ThreadDome1 {
    public static void main(String[] args) {
        //创建线程实例
        MyThread mt1 = new MyThread();
        //修改线程名字
        mt1.setName("Thread-one");
        //启动线程
        mt1.start();


        //创建线程实例
        MyThread mt2 = new MyThread();
        //修改线程名字
        mt2.setName("Thread-two");
        //启动线程
        mt2.start();
    }
}
