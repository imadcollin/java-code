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
            return (a < 0 && b < 0);
        }
        return ((a > 0 && b < 0) || (a < 0 && b > 0));
    }

    public String frontBack(String str) {
        String newStr = "";
        char a = str.charAt(0);
        char b = str.charAt(str.length() - 1);
        if (str != null && str.trim().length() > 0) {
            str = str.replace("" + a, "" + b);
            str = str.substring(0, str.length() - 1);
            str = str.concat("" + a);
        }
        return str;
    }

    public String reverse(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length() - 1; i++) {
            arr[i] = str.charAt(i);
        }
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
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

    @Test
    void testStringReplace2() {
        assertEquals("cba", frontBack("abc"));
        assertEquals("aavJ", frontBack("Java"));
    }

    @Test
    void testReverse() {
        assertEquals("cba", reverse("abc"));
        assertEquals("asdf", reverse("fdsa"));
        assertEquals("asdf", reverse("fdsa"));
        assertEquals("welcome", reverse("emoclew"));
    }
}
