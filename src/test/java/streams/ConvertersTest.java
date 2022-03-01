package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConvertersTest {
    private static Converters converters;

    @BeforeAll
    static void intt() {
        converters = new Converters();
    }

    @Test
    void testConvertMaptoList() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        assertEquals(3, converters.mapValuestoList(map).size());
    }

    @Test
    void testConvertMaptoList2() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        assertEquals(3, converters.mapValuestoList2(map).size());
    }

    @Test
    void testConvertMaptoList3() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        assertEquals(3, converters.mapValuestoList3(map).size());
    }

    @Test
    void testConvertListOfMapToStringList() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(map);
        assertEquals(3, converters.listOfMapToStringList(mapList).size());
        assertEquals("one", converters.listOfMapToStringList(mapList).get(0));
        assertEquals("two", converters.listOfMapToStringList(mapList).get(1));
    }

    @Test
    void testConvertListOfMapToStringList2() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(map);
        assertEquals(3, converters.listOfMapToStringList2(mapList).size());
        assertEquals("one", converters.listOfMapToStringList2(mapList).get(0));
        assertEquals("two", converters.listOfMapToStringList2(mapList).get(1));
    }

    @Test
    void testConvertMapToList() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertEquals(3, converters.listToMap(list).size());
        assertEquals("one", converters.listToMap(list).get("1"));
        assertEquals("two", converters.listToMap(list).get("2"));
        assertEquals("three", converters.listToMap(list).get("3"));
    }

    @Test
    void testConvertMapToListStream() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertEquals(3, converters.listToMapStream(list).size());
        assertEquals(3, converters.listToMapStream(list).get("one"));
        assertEquals(3, converters.listToMapStream(list).get("two"));
        assertEquals(5, converters.listToMapStream(list).get("three"));
    }

}