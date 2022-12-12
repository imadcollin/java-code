package best.practices;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class One {
    private Date create;  //meaningful
    private Date deletedDate; //meaningful

    List<Integer> integerList;
    int[] ints; // bad

    private String e; //bad
    private String url;

    public void addNumber(int num) {
    }

    public void deleteNumber(int xNum) {
    } //no need for pre

    //Domain names
    public class CounterFactory {
    } //for factory

    //only one thing
    void addNumAndRemoveNum(int a, int b) {
        //list.add(a)
        //list-remove(b)
    }

    public static <T> T[] arrayConcat(T[] first, T[] second) {
        var result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static void main(String[] args) {
        Object[] arr = new Object[3];
        arr[0] = new Object();
        arr[2] = new Object();

        Object[] arr2 = new Object[3];
        arr[0] = new Object();
        arr[2] = new Object();

        System.out.println(arrayConcat(arr, arr2).length);

    }


}
