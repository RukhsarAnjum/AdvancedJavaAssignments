package Designpattern.cake.problem;

import java.util.Scanner;

public class CakeDemo {
    public static void main(String[] args) {
        Cake cake=null;
        System.out.println("Which cake do you like to eat Blackforest/pineapple :");
        Scanner sc=new Scanner(System.in);
        String choice= sc.nextLine();
        sc.close();
        CakeFactory cakeFactory=new CakeFactory();
        cake=cakeFactory.createCake(choice);
        cake.aboutCake();
    }
}
