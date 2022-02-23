package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}