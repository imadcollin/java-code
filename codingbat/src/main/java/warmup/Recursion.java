package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Recursion {
    public int fact(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return n * fact(n - 1);
    }

    @Test
    void testFact() {
        assertEquals(fact(1), 1);
        assertEquals(fact(2), 2);
        assertEquals(fact(3), 6);
        assertEquals(fact(4), 24);
        assertEquals(fact(5), 120);
    }

    public int boonies(int num) {
        if (num == 0) return 0;
        if (num == 1) return 2;
        if (num % 2 == 0) return 3 + boonies(num - 1);
        if (num % 2 != 0) return 2 + boonies(num - 1);
        return 0;

    }

    @Test
    void testBoonies() {
        assertEquals(boonies(2), 5);
        assertEquals(boonies(3), 7);
        assertEquals(boonies(5), 12);
        assertEquals(boonies(10), 25);
    }

    public int count7(int n) {
        if (n == 0) return 0;
        if (n <= 10) {
            if (n > 6) return 1;
            return 0;
        }

        int count = 0;
        if (n % 10 == 7) {
            count++;
        }
        if (n / 10 == 0) return count;
        return count + count7(n / 10);
    }

    @Test
    void testCount() {

        assertEquals(count7(3), 0);
        assertEquals(count7(7), 1);
        assertEquals(count7(10), 1);
        assertEquals(count7(717), 2);
        assertEquals(count7(777576197), 5);
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s.substring(0, 1));
    }

    public int countX(String str) {
        if (str == null || str.equals("") || str.length() == 0) return 0;
        if (str.charAt(0) == 'x' || str.charAt(0) == 'X') return 1 + countX(str.substring(1));
        else
            return countX(str.substring(1));
    }

    @Test
    public void testCountX() {
        assertEquals(1, countX("abcXa"));
        assertEquals(2, countX("abcXxa"));
        assertEquals(3, countX("abcXaXx"));
        assertEquals(4, countX("xxbcXX"));
    }

    public int strCount(String str, String sub) {
        int count = 0;
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equalsIgnoreCase(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    @Test
    public void testStrCount() {
        assertEquals(1, strCount("catone", "cat"));
        assertEquals(2, strCount("catoncate", "cat"));
        assertEquals(3, strCount("catonecatcat", "cat"));
    }

    public int countAbc(String str) {
        if (str.equalsIgnoreCase("abc") || str.equalsIgnoreCase("aba")) return 1;
        if (str.length() > 3) {
            if (str.substring(0, 3).equalsIgnoreCase("abc") || str.substring(0, 3).equalsIgnoreCase("aba"))
                return 1 + countAbc(str.substring(1));
            return countAbc(str.substring(1));
        }
        return 0;
    }

    @Test
    void testCountAbc() {
        assertEquals(0, countAbc("axxc"));
        assertEquals(1, countAbc("abc"));
        assertEquals(2, countAbc("abcabc"));
        assertEquals(2, countAbc("abaaba"));
        assertEquals(2, countAbc("ababc"));
    }

    public int countHi2(String str) {
        if (str.equals("") || str == null) return 0;
        if (str.length() == 2) {
            if (str.equals("hi")) return 1;
        }
        if (str.substring(0, 1).equals("x")) return countHi2(str.substring(3));

        if (str.substring(0, 2).equals("hi")) return 1 + countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }


    @Test
    void testCountHi() {
        assertEquals(1, countHi2("hi"));
        assertEquals(2, countHi2("ahihi"));
        assertEquals(3, countHi2("ahihihi"));
    }

    public String pairStar(String str) {
        if (str.equals("")) return "";
        if (str.length() == 1) return str;

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }

        return str.charAt(0) + pairStar(str.substring(1));
    }

    @Test
    void testPairString() {
        assertEquals("hel*lo", pairStar("hello"));
        assertEquals("a*a*a*a", pairStar("aaaa"));
        assertEquals("a*a", pairStar("aa"));
        assertEquals("a*ax*x", pairStar("aaxx"));
        assertEquals("x*xa*a", pairStar("xxaa"));
    }

    public int array11(int[] nums, int index) {
        if (nums.length == 0) return 0;
        if (index >= nums.length) return 0;
        if (nums[index] == 11) return 1 + array11(nums, index + 1);
        else
            return array11(nums, index + 1);
    }

    @Test
    void testArry11() {
        assertEquals(1, array11(new int[]{1, 2, 11, 2}, 0));
        assertEquals(1, array11(new int[]{1, 2, 11}, 0));
        assertEquals(2, array11(new int[]{1, 2, 11, 11}, 0));
        assertEquals(3, array11(new int[]{11, 11, 1, 2, 11}, 0));
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return false;
        if (index < nums.length) {
            if (nums[index] * 10 == nums[index + 1]) {
                return true;
            } else
                return array220(nums, index + 1);
        }
        return false;
    }

    @Test
    void testArray220() {
        assertEquals(true, array220(new int[]{1, 2, 20}, 0));
        assertEquals(true, array220(new int[]{3, 30}, 0));
        assertEquals(false, array220(new int[]{}, 0));
        assertEquals(true, array220(new int[]{1, 2, 20}, 0));
        assertEquals(true, array220(new int[]{3, 3, 30, 4}, 0));
    }


    public String noX(String str) {
        if (str == "" || str.length() == 0) return "";

        if (str.length() == 1 && str.equals("x")) return "";

        if (str.charAt(0) == 'x') return noX(str.substring(1));

        return str.charAt(0) + noX(str.substring(1));
    }

    @Test
    void testNoX() {

        assertEquals("abc", noX("abc"));
        assertEquals("ac", noX("xac"));
        assertEquals("ac", noX("axc"));
        assertEquals("ac", noX("axc"));
        assertEquals("ac", noX("axcxx"));
        assertEquals("ac", noX("xxaxc"));


    }

    public int count8(int n) {
        if (n < 1) return 0;
        if (n <= 10) {
            if (n == 8) return 1;
            return 0;
        }
        int right = n % 10;
        int times = right;
        if (right == 8) {
            int trail = n / 10;
            int i = trail % 10;
            if (times == i) return 2 + count8(n / 10);
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    @Test
    void testCount8() {
        assertEquals(1, count8(8));
        assertEquals(1, count8(128));
        assertEquals(2, count8(8228));
        assertEquals(3, count8(881212));
        assertEquals(4, count8(8182818));
    }

    public int countHi(String str) {
        if (str.length() == 0 || str.equals("")) return 0;
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi")) return 1 + countHi(str.substring(1));
        else
            return countHi(str.substring(1));
    }

    @Test
    void testCountHis() {
        assertEquals(1, countHi("hi"));
        assertEquals(2, countHi("hieeeehi"));
        assertEquals(3, countHi("hidddhidhi"));
        assertEquals(4, countHi("hihihihi"));
    }

    public int sumDigits(int n) {
        if (n < 10) return n;
        int right = n % 10;
        return right + sumDigits(n / 10);
    }

    @Test
    void testSumDigits() {
        assertEquals(1, sumDigits(1));
        assertEquals(10, sumDigits(91));
        assertEquals(15, sumDigits(13443));
        assertEquals(15, sumDigits(12345));
        assertEquals(25, sumDigits(19195));
    }
}
