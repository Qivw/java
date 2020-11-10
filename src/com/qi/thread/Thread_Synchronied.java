package com.qi.thread;

/**
 * 同步Synchronied的第一种用法
 */
public class Thread_Synchronied{

    public void test(){
        int i = 0;
        Object o = new Object();

        while(true){
            i++;
            synchronized (o){
                if(i==5){
                    System.out.println("达到了。。。");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread_Synchronied thread_synchronied = new Thread_Synchronied();
        thread_synchronied.test();
    }
}
