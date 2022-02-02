package ds;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilteringTest {

    @Test
    void testFilter() {
        Filtering filtering = new Filtering();
        List<Object> list = Arrays.asList(1, 2, "tttt", 4);
        assertEquals(3, filtering.filterList(list).size());
        assertEquals(1, filtering.filterList(list).get(0));
        assertEquals(2, filtering.filterList(list).get(1));
        assertEquals(4, filtering.filterList(list).get(2));
    }

    @Test
    void testFilter2() {
        Filtering filtering = new Filtering();
        List<Object> list = Arrays.asList(1, 2, "tttt", 4);
        assertEquals(3, filtering.filter2(list).size());
        assertEquals(1, filtering.filterList(list).get(0));
        assertEquals(2, filtering.filterList(list).get(1));
        assertEquals(4, filtering.filterList(list).get(2));
    }
}