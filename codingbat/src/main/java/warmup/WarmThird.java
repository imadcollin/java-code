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

    public boolean array123(int[] nums) {
        boolean check = false;
        for (int i = 0; i <= nums.length - 3; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (a == 1 && b == 2 && c == 3) check = true;
        }
        return check;
    }

    public boolean array1223(int[] nums) {
        boolean check = false;
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 1 &&
                    nums[i + 1] == 2
                    && nums[i + 2] == 3)
                check = true;
        }
        return check;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
            if (count == 3) return false;
        }
        return true;
    }

    public String frontTimes(String str, int n) {
        String s = "";
        if (str.length() < 3) {
            s = str;
        } else {
            s = str.substring(0, 3);
        }
        String st = "";
        while (n > 0) {
            n--;
            st += s;
        }
        ;
        return st;
    }

    public String stringBits(String str) {
        String s = "";
        int len = str.length();
        int idx = 0;
        while (idx < len) {
            s += str.charAt(idx);

            idx = idx + 2;

        }
        return s;
    }


    @Test
    void testDouble() {
        assertEquals(true, doubleX("xaxxx"));
        assertEquals(true, doubleX("aaaax"));
    }

    @Test
    void testArray() {
        assertEquals(true, array123(new int[]{1, 2, 3, 1}));
        assertEquals(false, array123(new int[]{1, 1, 2, 4, 1}));
        assertEquals(true, array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    @Test
    void testFront() {
        assertEquals("", frontTimes("abc", 0));
        assertEquals("abaaba", frontTimes("aba", 2));
        assertEquals("javjavjav", frontTimes("java", 3));
    }

    @Test
    void testFrontLen() {
        assertEquals("Hlo", stringBits("Hello"));
        assertEquals("H", stringBits("Hi"));
        assertEquals("ace", stringBits("abcdef"));
    }
}


