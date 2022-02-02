package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public List<Integer> filterList(List list) {
        List<Integer> integerList = new ArrayList<>();
        for (Object i : list
        ) {
            if (i instanceof Integer) integerList.add((Integer) i);
        }
        return integerList;
    }

    public List<Integer> filter2(List list) {

        return (List<Integer>) list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
    }
}
