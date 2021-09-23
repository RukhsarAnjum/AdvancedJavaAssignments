package com.collable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableTester {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        Future<Integer> future=executorService.submit(new CollableExample());
        try{
            Integer futureIntObject=future.get();
            System.out.println(futureIntObject);
        } catch(ExecutionException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
