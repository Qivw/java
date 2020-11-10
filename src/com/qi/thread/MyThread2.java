package com.qi.thread;

/**
 * Thread.currentThread() 返回当前线程对象
 */
public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
