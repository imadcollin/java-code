package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}