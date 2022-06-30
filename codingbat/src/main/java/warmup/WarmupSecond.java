package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmupSecond {

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 && b < 0) return true;
            return false;
        }
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) return true;
        return false;
    }

    public boolean posNeg2(int a, int b, boolean negative) {
        if (negative) {
            return  (a < 0 && b < 0) ;
        }
        return  ((a > 0 && b < 0) || (a < 0 && b > 0)) ;
    }

    @Test
    void testPosNeg() {
        assertEquals(posNeg(1, -1, false), true);
        assertEquals(posNeg(-1, 1, false), true);
        assertEquals(posNeg(-4, -5, true), true);
    }

    @Test
    void testPosNeg2() {
        assertEquals(posNeg2(1, -1, false), true);
        assertEquals(posNeg2(-1, 1, false), true);
        assertEquals(posNeg2(-4, -5, true), true);
    }
}
