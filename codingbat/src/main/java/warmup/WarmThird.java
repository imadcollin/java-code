package warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

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

    public int getCount(int[] nums) {
        return (int) Arrays.stream(nums).filter(x -> x == 9).count();
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

    @Test
    void testCount() {
        assertEquals(2, getCount(new int[]{1, 9, 9, 3}));
        assertEquals(1, getCount(new int[]{1, 9, 3}));
        assertEquals(4, getCount(new int[]{9, 1, 9, 9, 3, 9}));
    }

    public int stringMatch(String a, String b) {

        int count = 0;
        if (a.contains(b)) return 1;
        for (int i = 0; i < a.length(); i++) {
            String match = "" + a.charAt(i);
            while (b.length() > i) {
                if (b.contains(match)) {
                    i++;
                    match += a.charAt(i);
                }
            }

            count++;

        }
        return count;
    }

    @Test
    void tetstSub() {
        String s = "abc";
        assertEquals(1, stringMatch("ab", "ab"));
        assertEquals(1, stringMatch("aabb", "ab"));
        assertEquals(1, stringMatch("a", "a"));
        assertEquals(1, stringMatch("abcbc", "bc"));
        assertEquals(1, stringMatch("a", "a"));
    }

    public String stringYak(String str) {
        if (str == null || str.length() == 0) return "";
        if (str.contains("yak"))
            return str.replace("yak", "");
        return str;

    }

    @Test
    void testStrubgYaj() {
        assertEquals(stringYak("yakpak"), "pak");
        assertEquals(stringYak("pakyak"), "pak");
        assertEquals(stringYak("yak123ya"), "123ya");
    }

    public int countXX(String str) {
        int count = 0;
        int ws = 0;
        if (str == null || str.length() == 0) return 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                ws++;
            }
            if (str.charAt(i) == 'x')
                count++;
        }
        if (count != 0) count = count - ws;
        return count > 1 ? count - 1 : count;
    }

    @Test
    void testCountXX() {
        assertEquals(countXX("abcxx"), 1);
        assertEquals(countXX("xxx"), 2);
        assertEquals(countXX("xxxx"), 3);
    }


    public int array667(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    @Test
    void testArray667() {

        assertEquals(1, array667(new int[]{6, 6, 2}));
        assertEquals(1, array667(new int[]{6, 6, 2, 6}));
        assertEquals(1, array667(new int[]{6, 7, 2, 6}));
    }

    public String stringX(String str) {
        if (str == null || str.length() == 0) return "";
        if (str.length() == 1) {
            return str;
        }
        String f = str.substring(0, 1);
        String e = str.substring(str.length() - 1, str.length());
        String newStr = str.substring(1, str.length() - 1).replaceAll("x", "");
        return f + newStr + e;

    }

    @Test
    void testXX() {
        assertEquals(stringX("xxHxix"), "xHix");
        assertEquals(stringX("abxxxcd"), "abcd");
        assertEquals(stringX("xabxxxcdx"), "xabcdx");
    }

    public boolean arrayFront9(int[] nums) {
        int count = 0;
        boolean c = false;
        while (nums.length - 1 >= count && count < 4) {
            if (nums[count] == 9) {
                return true;
            }
            count++;
        }
        return c;
    }

    @Test
    void testArrayFront() {
        assertEquals(arrayFront9(new int[]{1, 2, 3, 9, 5, 6}), true);
        assertEquals(arrayFront9(new int[]{9, 2, 3}), true);
        assertEquals(arrayFront9(new int[]{9, 2, 3, 3, 2}), true);
        assertEquals(arrayFront9(new int[]{1, 9}), true);
    }

    public double average(int[] nums) {
        return (double) Arrays.stream(nums).average().getAsDouble();
    }

    @Test
    void testAvg() {
        assertEquals(3, average(new int[]{1, 2, 3, 6}));
        assertEquals(2, average(new int[]{1, 2, 3}));
        assertEquals(5, average(new int[]{5, 5, 5, 5, 5}));
    }

    public int doubleCast(double x) {
        return (int) x;
    }

    @Test
    void testCasting() {
        assertEquals(3, doubleCast(3.4));
        assertEquals(3, doubleCast(3.14));
        assertEquals(45, doubleCast(45.4));
    }

    public List<Integer> doubling(List<Integer> numd) {

        return numd.stream().map(x -> x * 2).collect(Collectors.toList());
    }

    @Test
    void testDobling() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 4);
        assertEquals(2, doubling(integerList).get(0));
        assertEquals(4, doubling(integerList).get(1));
        assertEquals(6, doubling(integerList).get(2));
        assertEquals(8, doubling(integerList).get(3));
    }

    public List<String> copies3(List<String> strings) {
        List<String> stringList = new ArrayList<>();
        for (String s : strings
        ) {
            s += s + s;
            stringList.add(s);
        }
        return stringList;
    }

    @Test
    void testStringCopy() {
        assertEquals("aaa", copies3(Arrays.asList("a")).get(0));
        assertEquals("bbbbbbbbb", copies3(Arrays.asList("bbb")).get(0));
        assertEquals("ababab", copies3(Arrays.asList("ab")).get(0));
    }

    public List<String> copies32(List<String> strings) {
        return strings.stream().map(x -> x + x + x).collect(Collectors.toList());
    }

    @Test
    void testStringCopy2() {
        assertEquals("aaa", copies32(Arrays.asList("a")).get(0));
        assertEquals("bbbbbbbbb", copies32(Arrays.asList("bbb")).get(0));
        assertEquals("ababab", copies32(Arrays.asList("ab")).get(0));
    }

    public boolean am_i_wilson(double n) {
        int times = 0;
        for (int i = 1; i <= n; i++) {
            times += i * n;
        }
        return (times - 1) / Math.pow(n, 2) % 1 == 0;

    }

    @Test
    void testًWilson() {

        assertEquals(true, am_i_wilson(5));
    }

    int fact(long n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    boolean isPrime(long p) {
        if (p <= 1) {
            return false;
        }
        return (fact(p - 1) + 1) % p == 0;
    }

    @Test
    void testPrime() {
        assertEquals(false, isPrime(5));
    }

    boolean amIWilson(double P) {
        return (factorial(P - 1) + 1) / Math.pow(P, 2) % 1 == 0;
    }

    double factorial(double n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    @Test
    void testFPrime() {
        assertEquals(true, amIWilson(5));
        assertEquals(false, amIWilson(156));
    }

    public int duplicateCount(String text) {
        text = text.toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            for (int j = i + 1; j < text.length() - i; j++) {
                char c = text.charAt(j);
                if (c == ch) {
                    count++;
                }
                text = text.replaceAll("" + c, "");
            }
        }
        return count;
    }

    @Test
    void abcdeReturnsZero() {
        assertEquals(0, duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, duplicateCount("indivisibility"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;


        assertEquals(3, duplicateCount(test));
    }


}



