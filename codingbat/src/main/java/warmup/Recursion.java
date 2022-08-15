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


}
