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

    public static int diff21(int n) {
        if (n > 21) return (21 - n) * 2;
        return 21 - n;
    }

    public static boolean nearHundred(int n) {
        if (n <= 100) {
            return n >= 90;
        } else if (n > 100 && n < 200) {
            return n >= 190 || n <= 110;
        } else if (n >= 200 && n <= 300) {
            return n > 290 || n <= 210;

        }
        return false;

    }

    public static boolean nearHundred2(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
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


    @Test
    public void testDiff21() {
        assertEquals(diff21(19), 2);
        assertEquals(diff21(10), 11);
        assertEquals(diff21(21), 0);
    }

    @Test
    public void testmean() {
        assertEquals(nearHundred(93), true);
        assertEquals(nearHundred(90), true);
        assertEquals(nearHundred(89), false);
    }

    @Test
    public void testmean2() {
        assertEquals(nearHundred2(93), true);
        assertEquals(nearHundred2(90), true);
        assertEquals(nearHundred2(89), false);

    }

}
