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

    public boolean icyHot(int temp1, int temp2) {
        boolean cond1 = (temp1 < 0) && (temp2 > 100);
        boolean cond2 = (temp2 < 0) && (temp1 > 100);
        return cond1 || cond2;
    }

    public String startOz(String str) {
        String s = "";

        if (str.length() == 1) {
            if (str.charAt(0) == 'o') return s += 'o';
        }
        if (str.length() >= 2) {
            if (str.charAt(0) == 'o') s += 'o';
            if (str.charAt(1) == 'z') s += 'z';
            return s;
        }
        return "";
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

    @Test
    void testIceHo() {
        assertEquals(true, icyHot(120, -1));
        assertEquals(true, icyHot(-1, 120));
        assertEquals(false, icyHot(2, 120));
    }

    @Test
    void testOZ() {
        assertEquals("oz", startOz("ozymandias"));
        assertEquals("z", startOz("bzoo"));
        assertEquals("o", startOz("oxx"));

    }
}
