package Designpattern.cake.problem;

public class BlackForestCake extends Cake{
    public BlackForestCake(){
        setName("Black Forest");
        setType("Eggless");
        setPrice(700);
    }

    public void recipe(){
        System.out.println("------Black forest recipe---------");
        System.out.println("Seive together maida and coco powder");
        System.out.println("add sugar and vanilla essence");
        System.out.println("top with whipped cream");
        System.out.println("Chill and serve");
    }
    public void myFans(){
        System.out.println("Both kids and adults love me");
    }

}
