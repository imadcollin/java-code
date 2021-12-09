package lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CirculateTest {
    @Test
    public void circularListTest() throws Exception {
        final Circulate<String> xs = new Circulate<>("one", "two", "three");
        assertEquals(xs.next(), ("one"));
        assertEquals(xs.next(), ("two"));
        assertEquals(xs.next(), ("three"));

        assertEquals(xs.next(), ("one"));

        assertEquals(xs.prev(), ("three"));
        assertEquals(xs.prev(), ("two"));
        assertEquals(xs.prev(), ("one"));
        assertEquals(xs.prev(), ("three"));


    }
}