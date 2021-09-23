package com.mt.assignment;

public class Counter implements Runnable {
   // Storage storage=new Storage();
   Boolean flag = true;
    @Override
    public void run() {

        while(flag){
            try{
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Storage.count++;

        }
    }
}
