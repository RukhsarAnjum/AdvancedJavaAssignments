package com.mt.assignment;

public class Printer implements Runnable {
    Boolean flag=true;
    @Override
    public void run() {

        while(flag){
            try{
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Counter is : "+Storage.count++);
        }
    }
}
