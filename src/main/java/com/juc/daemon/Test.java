package com.juc.daemon;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().isDaemon());
            while (true) {

            }
        }, "t1");
        t1.setDaemon(true);
        t1.start();
        System.out.println(Thread.currentThread().getName() + "主线程结束------");
    }

}
