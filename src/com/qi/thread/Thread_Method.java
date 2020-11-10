package com.qi.thread;

/**
 * 线程的sleep方式及使用
 */
public class Thread_Method {

    static class M implements Runnable{

        /**
         * 测试sleep方法
         */
        @Override
        public void run() {
            for(int i = 0; i<100; i++){
                System.out.println("线程："+Thread.currentThread().getName()+".。。。。。。。。正在运行");

                if(i%10 == 0){
                    try {
                        System.out.println("睡一会。。。。。。。。");
                        Thread.sleep(500);
                        System.out.println("醒来继续！！");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }

    public static void main(String[] args) {

         M m = new M();
        new Thread(m,"Thread1").start();



    }

}

