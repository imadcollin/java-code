package streams;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CollectorExamplesTest {
    private static CollectorExamples collectorExamples;

    @BeforeAll
    static void intt() {
        collectorExamples = new CollectorExamples();
    }

    @Test
    void testUnmodifiedList() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertThrows(UnsupportedOperationException.class, () -> collectorExamples.unmodifiedList(list, "str"));
    }

    @Test
    void testUnmodifiedListthen() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertThrows(UnsupportedOperationException.class, () -> collectorExamples.unmodifiedList2(list, "str"));
    }

    @Test
    void testJoining() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertEquals("onetwothree", collectorExamples.join(list));
    }

    @Test
    void testJoiningSpaces() {
        List<String> list = Arrays.asList("one", "two", "three");
        assertEquals("one two three", collectorExamples.joinSpaces(list));
    }

    @Test
    void testGroupings() {
        List<String> list = Arrays.asList("1", "11", "111");
        assertEquals(3, collectorExamples.grouping(list).size());
        assertEquals(3, collectorExamples.grouping(list).values().size());
    }
}