package Designpattern.cake.problem;

public class PineappleCake extends Cake {
    public PineappleCake(){
        setName("Pineapple Cake");
        setType("Eggless");
        setPrice(700);
    }

    public void recipe(){
        System.out.println("------Pineapple Cake  recipe---------");
        System.out.println("Seive together maida and coco powder");
        System.out.println("add sugar and vanilla essence");
        System.out.println("top with whipped cream");
        System.out.println("Chill and serve");
    }
    public void myFans(){
        System.out.println("Both kids and adults love me");
    }

}
