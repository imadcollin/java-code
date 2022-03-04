package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

    @Test
    void testExchange() {
        MapsStream.Student s1 = new MapsStream.Student(1, "Bob", 31);
        MapsStream.Student s2 = new MapsStream.Student(2, "Eva", 35);
        MapsStream.Student s3 = new MapsStream.Student(3, "Joel", 26);
        List<MapsStream.Student> students = Arrays.asList(s1, s2, s2);

        assertEquals(3, mapsStream.ListObjectExchange(students).size());
        assertEquals("Bob", mapsStream.ListObjectExchange(students).get(0).getName());
        assertEquals("Eva", mapsStream.ListObjectExchange(students).get(1).getName());
    }

    @Test
    void testTransform() {
        Map<String, String> map = new HashMap<>();
        map.put("One", "1");
        map.put("two", "2");
        map.put("three", "3");

        assertEquals(3, mapsStream.transfer(map).entrySet().size());
        assertEquals(1, mapsStream.transfer(map).get("One"));

    }
}