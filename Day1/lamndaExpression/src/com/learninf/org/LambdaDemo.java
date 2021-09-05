package com.learninf.org;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
      //  new Thread(()-> System.out.println("Use of lambda expression")).start();

        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(2);
        number.add(3);
        number.add(6);
        number.add(5);

//without lambda
        for(Integer num:number){
            System.out.println(num);
        }


//with lambda
        System.out.println("-----------------------------------------");
        number.forEach((num)-> System.out.println(num));

//        addition(10,15)->System.out.println("Addition is" );
    }

//    Addition addition=(Integer numOne,Integer numTwo){
//        return numOne+numOne;
//    }
}
