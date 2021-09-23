package com.mt.assignment;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread counterThread=new Thread(counter);
        counterThread.setName("Counter thread");
        System.out.println(counterThread.getName()+"-"+counterThread.getPriority());
        counterThread.start();


        Printer printer=new Printer();
        Thread printerThread=new Thread(printer);
        printerThread.setName("Printer thread");
        System.out.println(printerThread.getName()+"-"+printerThread.getPriority());
        printerThread.start();




        System.out.println("Press enter to stop");
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        counter.flag = false;
        printer.flag=false;

    }
}
