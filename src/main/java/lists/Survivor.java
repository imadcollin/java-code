package lists;

import java.util.ArrayList;
import java.util.List;

public class Survivor {
    public static <T> List<T> josephusPermutation(final Object[] items, final int k) {
        List<T> newList = new ArrayList<>();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            count++;
            if (count == 2) {
                count = 0;
                newList.add((T) items[i]);
                break;
            }
        }
        return newList;
    }

}
