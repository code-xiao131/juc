package com.juc.future;

import java.util.concurrent.*;

//50ms
public class CompletableFutureTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        long start = System.currentTimeMillis();
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(200);
            return "h1";
        });
        System.out.println(executorService.submit(futureTask));
        FutureTask<String> futureTask1 = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(100);
            return "h2";
        });
        System.out.println(executorService.submit(futureTask1));
        FutureTask<String> futureTask2 = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "h3";
        });
        System.out.println(executorService.submit(futureTask2));
        System.out.println(futureTask.get());
        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());
        System.out.println("耗时" + (System.currentTimeMillis() - start));

    }
}
