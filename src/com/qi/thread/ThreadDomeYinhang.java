package com.qi.thread;

import com.mysql.jdbc.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * 面试题：模拟银行账户
 * 对业务写方法加锁
 * 读的方法不加锁
 * 这样行不行？
 */
public class ThreadDomeYinhang {
        String name;
        double balance;

        public synchronized void set(String name, double balance) {
            this.name = name;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            this.balance = balance;
        }

        public /*synchronized*/ double getBalance(String name) {
            return this.balance;
        }


        public static void main(String[] args) {
            //
            //new Thread(()->a.set("zhangsan", 100.0)).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    ThreadDomeYinhang a = new ThreadDomeYinhang();
                    a.set("zs",100.0);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(a.getBalance("zhangsan"));

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(a.getBalance("zhangsan"));
                }
            }).start();

        }
}


