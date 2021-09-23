package innerclass;

public class OuterDemo {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
//        outerClass.setName("Outer Class name");
//        System.out.println(outerClass.getName());

        OuterClass.InnerClass outInnerClass=outerClass.new InnerClass();
        outInnerClass.setInnerName("Inner name class");
        System.out.println(outInnerClass.getInnerName());

        outInnerClass.getnameOfOuterClass();
    }
}
