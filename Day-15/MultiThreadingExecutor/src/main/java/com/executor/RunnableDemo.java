package com.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableDemo {
    private static final int NTHREADS = 10;
//    private static final int NTHREADS =0;

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(NTHREADS);
        for(int i=0;i<=500;i++){
            Runnable task=new MyRunnable(10000000+i);
            executorService.execute(task);
        }
        executorService.shutdown();
        //wait untill all thread are finished
        try{
            executorService.awaitTermination(5, TimeUnit.MINUTES);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
