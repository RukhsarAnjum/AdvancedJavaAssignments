package com.mt.joins;

public class JoinEx {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        System.out.println("I started one thread");

    }

}
class MyRunnable implements Runnable{

    Integer count = 0;
    public void run(){

        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am running " + count++);
        }
    }
}
