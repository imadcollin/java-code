package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NewFeatureTest {

    private NewFeature newFeature;

    @BeforeEach
    void setup() {
        newFeature = new NewFeature();
    }

    @Test
    void testSwitchCase() {
        assertEquals("hello world", newFeature.switchCase("hello"));
    }

    @Test
    void testSwitchCase2() {
        assertEquals("holiday", newFeature.switchCase2("sat"));
        assertEquals("holiday", newFeature.switchCase2("sun"));
        assertEquals("working", newFeature.switchCase2("tues"));
    }

    @Test
    void testStringLength() {
        assertEquals(2, newFeature.stringLEngthNewWay("ab"));
        assertEquals(4, newFeature.stringLengthinstanse("abcd"));
        assertEquals(2, newFeature.stringLEngthNewWay("ab"));
        assertEquals(4, newFeature.stringLengthinstanse("abcd"));
    }

    @Test
    void testGetStringLineBreak() {
        assertTrue((newFeature.stringNewLine().contains("\n")));
    }

    @Test
    void testGetStringFormatted() {
        assertEquals("Name: Pop\nNickName: Lat\n", newFeature.getFormatedString("Pop", "Lat"));
    }
}