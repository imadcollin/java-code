package booleans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallEnoughTest {

    @Test
    public void basicTests() {
        assertEquals(true, SmallEnough.isSmallEnough(new int[] { 66, 101 }, 200));
        assertEquals(false, SmallEnough.isSmallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, SmallEnough.isSmallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, SmallEnough.isSmallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }

    @Test
    public void basicTests2() {
        assertEquals(true, SmallEnough.isSmallEnough2(new int[] { 66, 101 }, 200));
        assertEquals(false, SmallEnough.isSmallEnough2(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, SmallEnough.isSmallEnough2(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, SmallEnough.isSmallEnough2(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
}
