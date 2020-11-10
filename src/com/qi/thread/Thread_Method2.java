package com.qi.thread;

import java.util.concurrent.TimeUnit;

/**
 * 线程的join方法
 */
public class Thread_Method2 {

    static class M implements Runnable{

        @Override
        public void run() {
            for(int i = 0; i<10; i++){
                try {
                    System.out.println("我是线程："+Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        Thread thread1 = new Thread(new M(),"thread1");
        Thread thread2 = new Thread(new M(),"thread2");

        thread1.start();
        //此方法会等待thread1执行完成之后再启动thread2，会按照顺序执行
        thread1.join();
        thread2.start();

    }
}


