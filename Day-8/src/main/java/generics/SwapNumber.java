package generics;

import java.util.Arrays;

public class SwapNumber {
    public static <T> T[] swap(T [] list, int firstPos, int secondPos){
        if(firstPos<0 || secondPos<0 || firstPos> list.length || secondPos> list.length){
            throw new IndexOutOfBoundsException();
        }
        T temp=list[firstPos];
        list[firstPos]=list[secondPos];
        list[secondPos]=temp;
        return list;
    }

    public static void main(String[] args) {

        Integer swapArr[]={12,34,56,23,78,89};
        try {
            System.out.println(Arrays.asList(swap(swapArr, 1, -7)));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        String swapArrString[] = {"robin", "batman", "superman", "Rukhsar", "Herione"};
        try {
            System.out.println(Arrays.asList(swap(swapArrString,1,3)));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
