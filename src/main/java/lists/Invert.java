package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Invert {
    public static int[] invertingList(int[] items) {
        List list = new ArrayList<>();
        for (int item : items
        ) {
            item = (-1) * (item);
            list.add(item
            );
        }
        return list.stream().mapToInt(i -> (int) i).toArray();
    }

    public static int[] invertingList2(int[] items) {
        return Arrays.stream(items).map(i->-i).toArray();
    }

}
