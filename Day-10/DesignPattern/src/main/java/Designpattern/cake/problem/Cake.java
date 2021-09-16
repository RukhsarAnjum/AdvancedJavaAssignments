package Designpattern.cake.problem;

public abstract class Cake {
    private String name;
    private String type;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void recipe();
    public abstract void myFans();
    public void aboutCake(){
        System.out.println("I am " +name+ " cake");
        System.out.println("My fans is : ");
        myFans();
        System.out.println("You can get a "+name+ "at "+price);
    }
}
