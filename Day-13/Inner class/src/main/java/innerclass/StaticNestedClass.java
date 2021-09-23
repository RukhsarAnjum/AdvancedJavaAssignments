package innerclass;

public class StaticNestedClass {
    private String name;
    private static String greeting="Static nested inner class";
    static class InnerStaticClass{
        void displayMessage(){
            System.out.println("Variable greeting value is " +greeting);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.InnerStaticClass staticNestedClass=new StaticNestedClass.InnerStaticClass();
        staticNestedClass.displayMessage();
        String message=InnerStaticClass.greeting;
        System.out.println(InnerStaticClass.greeting);
    }
}
