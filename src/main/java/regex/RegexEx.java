package regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class RegexEx {

    @Test
    void testMatchers() {

        assertTrue(Pattern.matches("[abc]", "b"));
        assertTrue(Pattern.matches("[abc]", "c"));
        assertTrue(Pattern.matches("[abc]", "a"));

        assertFalse(Pattern.matches("[abc]", "t"));

        assertTrue(Pattern.matches("[a-c]", "a"));
        assertTrue(Pattern.matches("[a-c]", "b"));
        assertTrue(Pattern.matches("[a-c]", "c"));

        assertFalse(Pattern.matches("[a-c]", "abc"));
    }

    @Test
    void testOccurrence() {

        assertTrue(Pattern.matches("[abc]?", "a"));
        assertTrue(Pattern.matches("[abc]?", "b"));
        assertTrue(Pattern.matches("[abc]?", "c"));

        assertFalse(Pattern.matches("[abc]?", "ab"));
        assertFalse(Pattern.matches("[abc]?", "bb"));
        assertFalse(Pattern.matches("[abc]?", "ccc"));

        assertTrue(Pattern.matches("[abc]+", "a"));
        assertTrue(Pattern.matches("[abc]+", "b"));
        assertTrue(Pattern.matches("[abc]+", "c"));
        assertTrue(Pattern.matches("[abc]+", "aa"));
        assertTrue(Pattern.matches("[abc]+", "bb"));
        assertTrue(Pattern.matches("[abc]+", "bbbbbbbb"));
        assertTrue(Pattern.matches("[abc]+", "cccccccccccc"));

        assertFalse(Pattern.matches("[abc]*", "x"));

    }

    @Test
    void testStartMatch() {
        assertTrue(Pattern.matches("[a-z]*", ""));
        assertTrue(Pattern.matches("[a-z]*", "a"));
        assertTrue(Pattern.matches("[a-z]*", "b"));
        assertTrue(Pattern.matches("[a-z]*", "c"));
        assertTrue(Pattern.matches("[a-z]*", "aa"));
        assertTrue(Pattern.matches("[a-z]*", "bbbbbb"));
        assertTrue(Pattern.matches("[a-z]*", "cccccccccc"));

        assertTrue(Pattern.matches("[a-z]*", "w"));
    }

    @Test
    void testDigits() {
        assertTrue(Pattern.matches("\\d", "1"));
        assertTrue(Pattern.matches("\\d", "2"));

        assertFalse(Pattern.matches("\\d", "22222"));
        assertTrue(Pattern.matches("\\D", "s"));
        assertTrue(Pattern.matches("\\D*", "nondigit"));
    }

    @Test
    void testCharMatch() {
        String regex = "H.llo";
        assertTrue(Pattern.matches(regex, "Hello"));
        assertTrue(Pattern.matches(regex, "Hqllo"));
        regex = "Hi\\D*";
        assertTrue(Pattern.matches(regex, "Hii"));
        assertTrue(Pattern.matches(regex, "Hiiiiiiii"));

        assertFalse(Pattern.matches(regex, "Hi2"));
        assertFalse(Pattern.matches(regex, "Hi123"));
    }

    @Test
    void commanMatches() {
        assertTrue(Pattern.matches("Hello", "Hello"));
        assertTrue(Pattern.matches("^Hello", "Hello"));
        assertTrue(Pattern.matches("Hello$", "Hello"));
        assertTrue(Pattern.matches("[H]", "H"));
        assertTrue(Pattern.matches("[H]|[h]", "H"));
        assertTrue(Pattern.matches("[H]|[h]", "h"));
        assertTrue(Pattern.matches("[HELLO]|[hello]", "h"));
        assertTrue(Pattern.matches("[HELLO]|[hello]", "O"));
        assertTrue(Pattern.matches("o$|O$", "O"));
        assertTrue(Pattern.matches("[o|O]$", "O"));
    }

    @Test
    void testMatchCharacters() {
        assertTrue(Pattern.matches("\\d", "5"));
        assertTrue(Pattern.matches("\\D", "R"));
        assertTrue(Pattern.matches("\\s", " "));

        assertTrue(Pattern.matches("\\w", "H"));
        assertTrue(Pattern.matches("\\w", "5"));
        assertTrue(Pattern.matches("\\w", "_"));
        assertTrue(Pattern.matches(".s", "xs"));
        assertTrue(Pattern.matches("..s", "xas"));
        assertTrue(Pattern.matches("...s", "aaas"));

    }

    @Test
    void testMatchGrouping() {
        String alpha = "([a-z]|[A-Z0-9]){6}";
        assertTrue(Pattern.matches(alpha, "testaa"));
        assertTrue(Pattern.matches(alpha, "test12"));

        String num = "[789]{1}[0-9]{9}";
        assertTrue(Pattern.matches(num, "7123456789"));
        assertTrue(Pattern.matches(num, "7123456789"));
    }

    @Test
    void testEx1() {
        // a string that has a p followed by zero or more q's
        String regex = "pq*";
        assertTrue(Pattern.matches(regex, "p"));
        assertTrue(Pattern.matches(regex, "pq"));
        assertTrue(Pattern.matches(regex, "pqqq"));
    }

    @Test
    void testEx2() {
        // find sequences of lowercase letters joined with a underscore
        String regex = "[a-z]+_[a-z]+$";
        assertTrue(Pattern.matches(regex, "a_b"));
        assertTrue(Pattern.matches(regex, "test_test"));
        assertTrue(Pattern.matches(regex, "pq_sscccc"));
    }

    @Test
    void testEx3() {
        //sequences of one upper case letter followed by lower case letters
        String regex = "[A-Z]+[a-z]+$";
        assertTrue(Pattern.matches(regex, "Ab"));
        assertTrue(Pattern.matches(regex, "Ttest"));
        assertTrue(Pattern.matches(regex, "Psscccc"));
    }

    @Test
    void testEx4() {
        //a string that has a 'p' followed by anything, ending in 'q
        String regex = "p[A-Za-z_0-9]+g+$";
        assertTrue(Pattern.matches(regex, "pA0bg"));
        assertTrue(Pattern.matches(regex, "ptestg"));
        assertTrue(Pattern.matches(regex, "pssccccg"));
    }

    @Test
    void testEx5() {
        //a word contains the character 'g' in a given string
        String regex = "\\w*g.\\w*";
        assertTrue(Pattern.matches(regex, "ggg"));
        assertTrue(Pattern.matches(regex, "google"));
        assertTrue(Pattern.matches(regex, "long."));
        assertTrue(Pattern.matches(regex, "game"));

        assertFalse(Pattern.matches(regex, "long"));
        assertFalse(Pattern.matches(regex, "g"));
    }

    @Test
    void testEx6() {
        //a word containing 'g', not at the start or end
        String regex = "[^g]\\w*g.\\w*[^g]";
        assertTrue(Pattern.matches(regex, "aaaaagaaa"));
        assertTrue(Pattern.matches(regex, "bgbl"));
        assertTrue(Pattern.matches(regex, "cccg.kk"));

        assertFalse(Pattern.matches(regex, "g"));
        assertFalse(Pattern.matches(regex, "game"));
        assertFalse(Pattern.matches(regex, "long"));
    }

    @Test
    void testEx6_2() {
        //a word containing 'g', not at the start or end
        String regex = "[^g]+g[^g]+";
        assertTrue(Pattern.matches(regex, "aga"));
        assertTrue(Pattern.matches(regex, "bgbl"));
        assertTrue(Pattern.matches(regex, "cccg.kk"));

        assertFalse(Pattern.matches(regex, "g"));
        assertFalse(Pattern.matches(regex, "game"));
        assertFalse(Pattern.matches(regex, "long"));

    }

    @Test
    void testEx7() {
        //contains only upper and lowercase letters, numbers, and underscores
        String regex = "[a-zA-Z0-9_]*$";
        assertTrue(Pattern.matches(regex, "A"));
        assertTrue(Pattern.matches(regex, "ABC"));
        assertTrue(Pattern.matches(regex, "A11"));
        assertTrue(Pattern.matches(regex, "123"));
        assertTrue(Pattern.matches(regex, "1_"));
        assertTrue(Pattern.matches(regex, "_"));

        assertFalse(Pattern.matches(regex, "%"));
        assertFalse(Pattern.matches(regex, "#"));
        assertFalse(Pattern.matches(regex, "12¤"));
        assertFalse(Pattern.matches(regex, "*"));

    }

    @Test
    void tsetExHyphen() {
        // insert a dash (-) between an upper case letter and a lower case letter
//        String regex = "^[a-zA-Z0-9]+(?:-?[a-zA-Z0-9]+)+$";
        //  assertTrue(Pattern.matches(regex, "Aall"));
        String regex = "[a-zA-Z0-9]+\\-+[a-zA-Z0-9]+";
        assertTrue(Pattern.matches(regex, "Aall-test"));
        assertTrue(Pattern.matches(regex, "Aall-test-test"));
        assertTrue(Pattern.matches(regex, "Aall-test-test"));
        assertFalse(Pattern.matches(regex, "-Aall-test-test"));
        assertFalse(Pattern.matches(regex, "Aall-test-test-"));
        assertFalse(Pattern.matches(regex, "Aall-test--test"));


    }

    @Test
    void tsetEx8() {
        // insert a dash (-) between an upper case letter and a lower case letter
        String regex = "(?<=[A-Z])(?=[a-z])";
        assertEquals("S-ome text", "Some text".replaceAll("(?<=[A-Z])(?=[a-z])", "-"));
        assertEquals("S-omE text", "SomE text".replaceAll("(?<=[A-Z])(?=[a-z])", "-"));
        assertEquals("SO-me text", "SOme text".replaceAll("(?<=[A-Z])(?=[a-z])", "-"));


        assertEquals("SO-me text", "SOme text".replaceAll("(?<=[A-Z])(?=[a-z])", "-"));
    }


    @Test
    void testA1() {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foofoo");
        int count = -1;
        do {
            count++;
        } while (matcher.find());
        assertEquals(2, count);
    }

    @Test
    void testA2() {

        assertEquals(2, matches("foo", "foofoo"));
    }

    @Test
    void testA3() {

        assertEquals(1, matches("[abc]", "foocfoo"));
        assertEquals(2, matches("[abc]", "afoocfoo"));
        assertEquals(3, matches("[abc]", "abfoocfoo"));

        assertEquals(2, matches("[^abc]", "gcd"));
        assertEquals(3, matches("[^a]", "bcd"));
        assertEquals(3, matches("[^abc]", "eee"));
    }

    @Test
    void testA4() {
        assertEquals(6, matches("[1-3[7-9]]", "123456789"));
        assertEquals(5, matches("[1-3[8-9]]", "123456789"));
        assertEquals(1, matches("[1-3[2-5]]", "46789"));
    }

    @Test
    void testA5() {
        assertEquals(3, matches("[1-3&&[^78]]", "123456789"));
        assertEquals(3, matches("[1-9&&[345]]", "123456789"));
    }

    @Test
    void test_is_digit() {
        assertEquals(3, matches("\\d", "123cde"));
        assertEquals(5, matches("\\d", "abd56789"));
    }

    @Test
    void test_is_not_digit() {
        assertEquals(3, matches("\\D", "123456789abs"));
        assertEquals(4, matches("\\D", "123abcd"));
    }

    @Test
    void test_is_space() {
        assertEquals(1, matches("\\s", "123456 789abs"));
        assertEquals(2, matches("\\s", "123  abcd"));
    }

    @Test
    void test_is_not_space() {
        assertEquals(12, matches("\\S", "123456 789abs"));
        assertEquals(7, matches("\\S", "123  abcd"));
    }

    @Test
    void test_grouping() {
        assertEquals(1, matches("\\d\\d", "12"));
        assertEquals(2, matches("\\d\\d", "1212"));
        assertEquals(3, matches("\\d\\d", "121212"));
        assertEquals(1, matches("\\d\\d", "12xw"));
        assertEquals(2, matches("\\d\\d", "12xw22"));
    }

    @Test
    void test_grouping_ref() {
        assertEquals(1, matches("(\\d\\d)\\d", "121"));


        assertEquals(1, matches("(\\d\\d)(\\d\\d)", "1212"));
        assertEquals(1, matches("(\\d\\d)(\\d\\d)(\\d)", "12121"));
        assertEquals(1, matches("\\d", "1www"));
        assertEquals(2, matches("\\d\\d", "1212xw"));

    }


    private int matches(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = -1;
        do {
            count++;
        } while (matcher.find());
        return count;
    }


}


