package innerclass;

public class LocalInnerClass {
    private static String msg="Local inner class message";
    public static void main(String[] args) {
        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.printMessage();

    }
  //Local inner class within the method
    void printMessage(){
        class LocalInner{
            void message(){
                System.out.println(msg);
            }
        }
        LocalInner localInner=new LocalInner();
        localInner.message();
    }
}
