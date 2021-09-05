package com.learning.org;

public interface DefaultMethod {
    //abstract method
    public void printInfo();

    //Default  method
    default void printMessage(){
        System.out.println("Default method is called");
    }
}
