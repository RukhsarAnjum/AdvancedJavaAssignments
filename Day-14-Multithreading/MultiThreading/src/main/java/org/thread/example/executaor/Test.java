package org.thread.example.executaor;

public class Test {
    private Integer count = 0;
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count){
        this.count=count;
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadClass t = new MyThreadClass();
        t.setName("my thread");
        t.start();
        System.out.println(t.getName());
        System.out.println(Thread.currentThread());

        MyRunnable myRunnable = new MyRunnable();
        //myRunnable.start();


        Thread thread = new Thread(myRunnable);
        thread.start();
       // thread.setPriority(1);
        int i=0;
        while (true){
            Thread.sleep(100);
            System.out.println("M-"+i++);
        }

    }

}


class MyThreadClass extends Thread{
    Test test = new Test();
    Boolean flag = true;
    public void run(){
        while(flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test.setCount(test.getCount() + 1);
            System.out.println("T-"+test.getCount());

        }
    }
}

class MyThreadClass1 extends Thread{
    Test test = new Test();

    public void run(){
        test.setCount(test.getCount()+1);
        System.out.println(test.getCount());
    }
}
class MyRunnable implements Runnable{
    Test test = new Test();
    @Override
    public void run() {
        test.setCount(test.getCount()+1);

        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test.setCount(test.getCount() + 1);
            System.out.println("R-"+test.getCount());

        }
    }
}

