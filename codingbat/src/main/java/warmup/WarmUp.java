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

    public String missingChar(String str, int n) {

        if (str == null && str.length() <= 0) {
            return "An empty string";
        }
        char a = str.charAt(n);
        return str.replace(String.valueOf(a), "");
    }

    public String missingChar2(String str, int n) {
        if (str == null && str.trim().length() <= 0) {
            return "An empty string";
        }

        return str.substring(0, n) + str.substring(n + 1);
    }

    public String backAround(String str) {
        if (str != null && str.trim().length() > 0) {
            char last = str.charAt(str.length() - 1);
            return String.valueOf(last) + str + String.valueOf(last);
        }
        return "An empty string";
    }

    public String backAround2(String str) {
        if (str != null && str.trim().length() > 0) {
            return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
        }
        return "An empty string";
    }

    public boolean startHi(String str) {
        if (str != null && str.trim().length() >= 2) {
            // return str.startsWith("hi");
            return str.substring(0, 2).equals("hi");
        }

        return false;
    }

    public boolean mixStart(String str) {
        if (str != null && str.trim().length() > 2)
            return str.substring(1, 3).equals("ix");
        return false;
    }

    public String everyNth(String str, int n) {
        StringBuilder newStr = new StringBuilder(str);
        if (str != null && str.trim().length() > 0) {

            if (n < str.length()) {

                for (int i = n; i < newStr.length() - 1; i = i + n) {
                    if (i < newStr.length() - 1)
                        newStr.deleteCharAt(i);
                }
            }
        }
        return newStr.toString();
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking) {

            if (hour < 7 || hour > 20) return true;
        }
        return false;
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

    @Test
    public void testMissingChar() {
        assertEquals(missingChar("kitten", 1), "ktten");
        assertEquals(missingChar("kitten", 0), "itten");
        assertEquals(missingChar("kitten", 4), "kittn");
    }

    @Test
    public void testMissingChar2() {
        assertEquals(missingChar2("kitten", 1), "ktten");
        assertEquals(missingChar2("kitten", 0), "itten");
        assertEquals(missingChar2("kitten", 4), "kittn");
    }

    @Test
    public void testLastAroound() {
        assertEquals(backAround("and"), "dandd");
        assertEquals(backAround("abc"), "cabcc");
        assertEquals(backAround("kitten"), "nkittenn");
    }

    @Test
    public void testLastAroound2() {
        assertEquals(backAround2("and"), "dandd");
        assertEquals(backAround2("abc"), "cabcc");
        assertEquals(backAround2("kitten"), "nkittenn");
    }

    @Test
    public void testStartWith() {
        assertEquals(startHi("hi there"), true);
        assertEquals(startHi("hi"), true);
        assertEquals(startHi("hello hi "), false);
    }

    @Test
    public void testMixStart() {
        assertEquals(mixStart("mix snacks"), true);
        assertEquals(mixStart("pix snacks"), true);
        assertEquals(mixStart("piz snacks"), false);
    }

    @Test
    public void testnth() {
        assertEquals(everyNth("mix snacks", 1), "mxsaks");
        assertEquals(everyNth("mix snacks", 2), "mi sacs");
        assertEquals(everyNth("mix snacks", 3), "mixsnaks");
    }

    @Test
    public void testMonkey() {
        assertEquals(monkeyTrouble(true, true), true);
        assertEquals(monkeyTrouble(false, false), true);
        assertEquals(monkeyTrouble(true, false), false);
    }

    @Test
    public void testMonkey2() {
        assertEquals(monkeyTrouble2(true, true), true);
        assertEquals(monkeyTrouble2(false, false), true);
        assertEquals(monkeyTrouble2(true, false), false);
    }

    @Test
    public void testParot() {
        assertEquals(parrotTrouble(true, 14), false);
        assertEquals(parrotTrouble(true, 3), true);
        assertEquals(parrotTrouble(true, 12), false);
    }
}
