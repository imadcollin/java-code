package feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}