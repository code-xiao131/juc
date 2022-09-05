package com.juc.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> stringFutureTask = new FutureTask<>(new T1());
        new Thread(stringFutureTask).start();
        System.out.println(stringFutureTask.get());
    }
}

class T1 implements Callable<String> {

    @Override
    public String call() {
        return "test";
    }
}
