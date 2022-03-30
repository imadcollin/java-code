package regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}


