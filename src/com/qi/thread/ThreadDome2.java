package com.qi.thread;

/**
 * 多线程实现方式二
 */
public class ThreadDome2 {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2();
        Thread t1 = new Thread(mt1);
        t1.setName("wang");
        t1.start();

        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);
        t2.setName("li");
        t2.start();
    }
}
