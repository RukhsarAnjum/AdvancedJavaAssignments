package generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * Supports arithmetic operations of +, -, *, / on any type that are subclasses
 * of {@link java.lang.Number}.
 * @author pchandra
 *
 */
public class ArithmeticOperation
{
    /**
     * Generic method to add 2 numbers.
     * @param t1
     * @param t2
     * @return
     */
    public static <T extends Number> Number add(T t1, T t2)
    { return (t1.doubleValue() + t2.doubleValue()); }
    /**
     * Demostrates Upper Bounded Wildcards.
     * Generic method to add numbers from a list.
     * @param t1
     * @param t2
     * @return
     */
    public static <T extends Number> Number sub(T t1, T t2)
    { return (t1.intValue() - t2.intValue()); }

    public static <T extends Number> Number mul(T t1, T t2)
    { return (t1.intValue() * t2.intValue()); }

    public static <T extends Number> Number div(T t1, T t2) {
        try {
            return (t1.intValue() / t2.intValue());
        } catch (ArithmeticException e) {
            throw e;
        }
    }
    public static <T extends Number> Number add(List<? extends Number> list)
    {
        double d = 0;;
        for (int i = 0; i < list.size(); i++)
            d += list.get(i).doubleValue();

        return new Double(d);
    }
    public static <T extends Number> Number sub(List<? extends Number> list)
    {
        double d = 0;;

            d = list.get(0).doubleValue()-list.get(1).doubleValue();

        return new Double(d);
    }

    /**
     * Demostrates Unbounded Wildcards.
     * Generic method to dump list data to console.
     * @param_t1
     * @param_t2
     * @return
     */
    public static void dumpList(List<?> list)
    {
        System.out.println("List dump with unbounded wildcard:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
    public static void main(String[] args)
    {


        // Adding 2 integers
        Integer i1 = new Integer(34), i2 = new Integer(43);
        Float f1 = new Float(12.56), f2 = new Float(3.6778);
        System.out.println("Addition of two integer no: " + ArithmeticOperation.add(i1, i2)+ " and Two float number :"+ArithmeticOperation.add(f1, f2));
        System.out.println("Subtraction of two integer no: " + ArithmeticOperation.sub(i1, i2)+ " and Two float number :"+ArithmeticOperation.sub(f1, f2));
        System.out.println("Multiplication of two integer no: " + ArithmeticOperation.mul(i1, i2)+ " and Two float number :"+ArithmeticOperation.mul(f1, f2));
        System.out.println("Devision of two integer no: " + ArithmeticOperation.div(i1, i2)+ " and Two float number :"+ArithmeticOperation.div(f1, f2));


        System.out.println("---------------------------------------------------");
        // Adding 2 integers through a list
        Vector<Number> l = new Vector<Number>();
        List<Integer> num= Arrays.asList(42,34);
//        l.add(new Integer(34));
//        l.add(new Integer(43));
        System.out.println("Add with upper bounded wildcard: " +
                ArithmeticOperation.add(num));
        System.out.println("sub with upper bounded wildcard: " +
                ArithmeticOperation.sub(num));

        // Dumping the list to the console.
        ArithmeticOperation.dumpList(num);
    }
}
