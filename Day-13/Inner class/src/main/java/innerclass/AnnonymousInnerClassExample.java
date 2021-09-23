package innerclass;

import java.sql.SQLOutput;

public class AnnonymousInnerClassExample {
    /**
     * 1. Class (may be abstract or concrete)
     * 2. interface
     */

    public static void main(String[] args) {

        //implementation of annonymous inner class using interface
        PrintInterface p1 = new PrintInterface() {
            @Override
            public void display() {
                System.out.println("Annonymous inner class");
            }
        };
        p1.display();

        //implementation of annonymous inner class using abstract
        PrintMessage printM = new PrintMessage() {
            @Override
            void printMessage() {
                System.out.println("Print abstract class message");
            }
        };
        printM.printMessage();
    }
}

//interface
interface PrintInterface{
    void display();
}

//abstract class
abstract class PrintMessage{
    abstract void printMessage();
}
