package innerclass;

public class NestedInterface implements ParentInterface.ChildInterface {
    public static void main(String[] args) {
        ParentInterface.ChildInterface msg=new NestedInterface();
        msg.displayChildMessage();
    }

    @Override
    public void displayChildMessage() {
        System.out.println("Nested interface demo --inside display child message method");
    }
}
