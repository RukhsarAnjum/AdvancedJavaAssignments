package org.thread.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SleepExample {
    public static void main(String[] args) {
        List<String> seasonlist=new ArrayList<>();
        seasonlist= Arrays.asList(new String[]{
            "winter",
            "Summer",
            "Spring",
            "Rainy"
        });
        for(String value:seasonlist){
            //pause it by 4 seconds
            try{
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(value);
        }
    }
}
