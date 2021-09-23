package com.executor;

public class MyRunnable implements java.lang.Runnable {
    private final long countUntill;

    public MyRunnable(long countUntill) {
        this.countUntill=countUntill;
    }

    @Override
    public void run() {
        long sum=0;
        for(long i=1;i<countUntill;i++){
            sum+=1;
        }
        System.out.println(sum);

    }
}
