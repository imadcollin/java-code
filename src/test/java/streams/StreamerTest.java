package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StreamerTest {
    private static Streamer streamer;

    @BeforeAll
    static void init() {
        streamer = new Streamer();
    }

    @Test
    void testStreamOf() {
        List<String> list = Arrays.asList("abc", "xy<");
        assertEquals("abc", streamer.streamOf(list).collect(Collectors.toList()).get(0));
    }

    @Test
    void testCollection() {
        Collection<String> collection = Arrays.asList("one", "two");
        assertEquals("one", streamer.collection(collection).collect(Collectors.toList()).get(0));
    }

    @Test
    void testBuilder() {
        assertEquals("one", streamer.builder("one", "two").collect(Collectors.toList()).get(0));
        assertEquals("two", streamer.builder("one", "two").collect(Collectors.toList()).get(1));
    }

    @Test
    void testGenerate() {
        assertEquals("one", streamer.generate("one").collect(Collectors.toList()).get(0));
        assertEquals(10, streamer.generate("one").collect(Collectors.toList()).size());
    }

    @Test
    void testIterate() {
        assertEquals(10, streamer.iterateByLimit(5, 10).size());
        assertEquals(5, streamer.iterateByLimit(5, 10).get(0));
        assertEquals(10, streamer.iterateByLimit(5, 10).get(1));
    }

    @Test
    void testRange() {
        assertEquals(1, streamer.range(1, 10).findFirst().getAsInt());
        assertEquals(2, streamer.range(1, 10).toArray()[1]);
        assertEquals(3, streamer.range(1, 10).toArray()[2]);
    }

    @Test
    void testFind() {
        assertEquals("one", streamer.findStr("one").get());
        assertEquals("two", streamer.findStr("two").get());
        assertNotEquals("four", streamer.findStr("four").orElse(""));
    }

    @Test
    void testPipes() {
        assertEquals("ONE", streamer.pipesCaps(Arrays.asList("one", "tow", "three"), "one").get());
        assertEquals("THREE", streamer.pipesCaps(Arrays.asList("one", "tow", "three"), "three").get());
    }

    @Test
    void testSum() {
        assertEquals(6, streamer.sums(1, 4));
        assertEquals(10, streamer.sums(1, 5));
        assertEquals(15, streamer.sums(1, 6));
    }

}