package regex;

import org.junit.jupiter.api.Test;

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
    void testEx8() {
        //check for a number at the end of a given string
        String regex = "\\w+[0-9]";
        assertTrue(Pattern.matches(regex, "a2"));
        assertTrue(Pattern.matches(regex, "abc2"));
        assertTrue(Pattern.matches(regex, "abcwd3222"));
        assertTrue(Pattern.matches(regex, "abcccc2"));
        assertTrue(Pattern.matches(regex, "123"));

        assertFalse(Pattern.matches(regex, "a"));
        assertFalse(Pattern.matches(regex, "abc"));
        assertFalse(Pattern.matches(regex, "a"));

        String rege2x = ".*[0-9]$";
        assertTrue(Pattern.matches(regex, "a2"));
        assertTrue(Pattern.matches(regex, "abc2"));
        assertTrue(Pattern.matches(regex, "abcwd3222"));
        assertTrue(Pattern.matches(regex, "abcccc2"));
        assertTrue(Pattern.matches(regex, "123"));

        assertFalse(Pattern.matches(regex, "a"));
        assertFalse(Pattern.matches(regex, "abc"));
        assertFalse(Pattern.matches(regex, "a"));
    }

    @Test
    void testEx9() {
        // replace Python with Java and code with coding in a given string
        assertEquals("Java is a coding language", "Python is a code language".replace("Python", "Java").replace("code", "coding"));
        assertEquals("Java is a perfect coding language", "Python is a good code language".replace("Python", "Java").replace("code", "coding").replace("good", "perfect"));

    }

    @Test
    void testEx10() {
        //find the word Python in a given string,
        assertTrue(validate("This string contain a word ", "word"));
        assertTrue(validate("This word is in ", "word"));

        assertFalse(validate("This string  without ", "word"));
    }

    private boolean validate(String str, String word) {
        if (word != null && str != null)
            return str.toLowerCase().contains(word.toLowerCase());
        return false;
    }
}


