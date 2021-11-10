package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Survivor {
    public static <T> Object josephusPermutation(final Object[] items, final int i) {
        int count = i;

        List<Object> myList = new ArrayList<>();
        for (int j = 0; j < items.length; j++) {

            if (count > items.length) {
                count = (count % 7);

            }
            myList.add(items[count - 1]);

            count = count + 3;
        }

        return myList.get(0);
    }


    public static <T> Object[] check(final Object[] items, final int i) {
        int count = i;

        List<Object> myList = new ArrayList<>();

        for (int j = 0; j < items.length; j++) {

            if (count > items.length) {
                count = (count % 7);

            }
            myList.add(items[count - 1]);

            count = count + 3;
        }
        return myList.toArray();
    }
}
