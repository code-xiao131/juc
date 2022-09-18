package com.juc.future;

import java.util.concurrent.TimeUnit;

public class DeadLock {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();
        new Thread(() -> {
            synchronized (objA) {
                System.out.println("thread a get a synchronized");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objB) {
                    System.out.println("thread a get b synchronized");
                }
            }
        }, "A").start();
        new Thread(() -> {
            synchronized (objB) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread b get a synchronized");
                synchronized (objA) {
                    System.out.println("thread b get b synchronized");
                }
            }
        }, "B").start();
    }
}
