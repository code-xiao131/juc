package com.juc.future;

import java.util.concurrent.TimeUnit;

//600ms
public class CompletableFutureTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        TimeUnit.MILLISECONDS.sleep(200);
        TimeUnit.MILLISECONDS.sleep(100);
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.println("耗时" + (System.currentTimeMillis() - start) );


    }
}
