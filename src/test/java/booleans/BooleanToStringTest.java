package booleans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanToStringTest {
    @Test
    public void testBoolToWord() {
        assertEquals(BooleanToString.boolToString(true), "true");
        assertEquals(BooleanToString.boolToString(false), "false");
    }
}