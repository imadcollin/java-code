import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class kissTest {
    private static Kiss kiss;

    @BeforeAll
    public static void init() {
        kiss = new Kiss();
    }

    @Test
    public void getDay() {
        assertEquals("Sat", kiss.getDayOfWeek(1));
        assertEquals("Sun", kiss.getDayOfWeek(2));
        assertEquals("Mon", kiss.getDayOfWeek(3));
    }

    @Test
    public void testGetDayKiss() {
        assertEquals("Sat", kiss.kiss(1));
        assertEquals("Sun", kiss.kiss(2));
        assertEquals("Mon", kiss.kiss(3));

    }

}