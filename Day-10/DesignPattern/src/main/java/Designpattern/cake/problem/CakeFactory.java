package Designpattern.cake.problem;

public class CakeFactory implements  Factory{
    public Cake createCake(String cakeName) {
        Cake cake=null;
        if(cakeName.equals("BlackForest")){
            cake=new BlackForestCake();
        }
        else if(cakeName.equals("BlackForest")){
            cake=new PineappleCake();
        }
        return cake;
    }
}
