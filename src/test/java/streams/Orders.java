package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class Orders {

    @Test
    public void twoCollection_different() {
        List<String> list = Arrays.asList("c", "b", "a");
        TreeSet<String> set = new TreeSet<String>(list);

        Object[] objects = list.toArray();
        Object[] setObjects = set.toArray();

        assertEquals("[c, b, a]", list.toString());
        assertEquals("[a, b, c]", set.toString());
    }

    @Test
    public void sorted() {
        int[] arr = {1, 2, 4, 3, 6};
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        assertEquals(integerList.size(), 5);
        List<Integer> sortList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        assertEquals(sortList.size(), arr.length);

        int[] sortedArray = new int[sortList.size()];
        for (int i = 0; i < sortList.size(); i++) {
            sortedArray[i] = sortList.get(i);
        }
        assertArrayEquals(new int[]{1, 2, 3, 4, 6}, sortedArray);

    }
}
