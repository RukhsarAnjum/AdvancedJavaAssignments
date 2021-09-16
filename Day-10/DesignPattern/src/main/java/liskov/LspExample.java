package liskov;

public class LspExample {
    public static void main(String[] args) {
        System.out.println("Area of rectangle is : ");
        Rectangle r =new Rectangle();
        r.setBreadth(10);
        r.setLength(15);
        calculateArea(r);
        System.out.println("-----------------------------------");

        System.out.println("Area of square is : ");
        Square s=new Square();
        s.setBreadth(10);
        calculateArea(s);
    }
    static void calculateArea(Rectangle r){
        System.out.println("Breadth is : " +r.getBreadth());
        System.out.println("Length is : " +r.getLength());
        System.out.println("Area is : "+r.getArea());
    }
}
