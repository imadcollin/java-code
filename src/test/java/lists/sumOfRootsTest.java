package lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumOfRootsTest {

    @Test
    void testSum1ofOneDigit() {
        assertEquals(sumOfRoots.sum(6), 6);
    }

    @Test
    void testSum1ofTwoDigits() {
        assertEquals(sumOfRoots.sum(13), 4);
    }

    @Test
    void testSum1ofThreeDigits() {
        assertEquals(sumOfRoots.sum(123), 6);
    }

    @Test
    void testSum1ofFourDigits() {
        assertEquals(sumOfRoots.sum(1234), 10);
    }

}