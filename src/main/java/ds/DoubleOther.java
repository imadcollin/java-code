package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DoubleOther {
    List<Integer> doubleScond(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int el = list.get(i);
            if (i % 2 != 0) {
                el = list.get(i) * 2;
            }
            integerList.add(el);
        }
        return integerList;
    }

    public List<Integer> doubletwo(List<Integer> list) {
        return IntStream.range(0, list.size()).mapToObj(index -> index % 2 != 0 ? (list.get(index)) * 2 : list.get(index)).collect(Collectors.toList());
    }

    public int[] doubleSecond(int arr[]) {
        return IntStream.range(0, arr.length).map(i -> i % 2 != 0 ? 2 * arr[i] : arr[i]).toArray();
    }
}
