package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarmThird {
    public String stringTimes(String str, int n) {
        if (str != null && str.trim().length() > 0) {
            String nStr = "";
            do {
                nStr += str;
                n--;
            } while (n > 0);
            return nStr;
        }
        return null;
    }


    @Test
    void testTimes() {
        assertEquals("HIHI", stringTimes("HI", 2));
        assertEquals("HIHIHI", stringTimes("HI", 3));
        assertEquals("HI", stringTimes("HI", 1));
    }

    boolean doubleX(String str) {
        if (str == null || str.trim().length() == 0) {
            return false;

        }
        for (int i = 0; i < str.length() - 1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            if (a == b) return true;
        }
        return false;
    }

    @Test
    void testDouble() {
        assertEquals(true, doubleX("xaxxx"));
        assertEquals(true, doubleX("aaaax"));
    }

}


