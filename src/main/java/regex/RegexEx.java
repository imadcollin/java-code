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
}


