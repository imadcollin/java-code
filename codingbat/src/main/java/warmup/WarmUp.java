package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmUp {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if ((weekday == false) && (vacation == false) || vacation == true) return true;
        return false;
    }

    public static boolean sleepIn2(boolean weekday, boolean vacation) {
        return (!weekday || vacation) ? true : false;
    }

    @Test
    public void testSleepIn() {
        assertEquals(sleepIn(false, false), true);
        assertEquals(sleepIn(true, false), false);
        assertEquals(sleepIn(false, true), true);
    }

    @Test
    public void testSleepIn2() {
        assertEquals(sleepIn2(false, false), true);
        assertEquals(sleepIn2(true, false), false);
        assertEquals(sleepIn2(false, true), true);
    }
}
