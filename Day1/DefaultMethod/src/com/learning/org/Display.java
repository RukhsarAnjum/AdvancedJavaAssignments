package com.learning.org;

public class Display implements DefaultMethod{
    public void printInfo(){
        System.out.println("Abstract method in default method of interface is called");
    }

    public static void main(String[] args) {
        new Display().printInfo();
        new Display().printMessage();
    }
}
