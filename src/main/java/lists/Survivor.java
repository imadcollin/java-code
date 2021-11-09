package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Survivor {
    public static <T> List<T> josephusPermutation(final Object[] items, final int k) {
        List<T> newList = new ArrayList<>();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < k; i++) {
            count++;
            if (count == 2) {
                count = 0;
                newList.add((T) items[i]);
                break;
            }
        }
        return newList;
    }

    public static <T> Object[] check(Object[] items, int i) {

        int count = i;

        List<Object> myList = new ArrayList<>();

        for (int j = 0; j < items.length; j++) {

            if (count > items.length) {
                count = (count % 7);

            }
            myList.add(items[count - 1]);

            count = count + 3;
        }
        System.out.println(myList);
        return myList.toArray();
    }

    private static <T> List<Object> generateNewList(Object[] items, Object item) {
        System.out.println(item);
        System.out.println(Arrays.stream(items).filter(x -> !x.equals(item)).collect(Collectors.toList()));

        return Arrays.stream(items).filter(x -> !x.equals(item)).collect(Collectors.toList());
    }
}
