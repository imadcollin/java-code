package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapsStreamTest {
    private static MapsStream mapsStream;

    @BeforeAll
    static void init() {
        mapsStream = new MapsStream();
    }

    @Test
    void testMapToList() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        assertEquals(3, mapsStream.mapToList(map).size());
        assertEquals("one", mapsStream.mapToList(map).get(0));
    }

    @Test
    void testMapMatch() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        assertEquals("two", mapsStream.getMatch(map, "2").get());
        assertEquals("three", mapsStream.getMatch(map, "3").get());
    }
}