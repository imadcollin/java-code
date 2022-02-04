package ds;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChallengesTest {
    private static Challenges challenges;

    @BeforeAll
    public static void init() {
        challenges = new Challenges();
    }

    @Test
    public void testReverse() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", challenges.reserve("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", challenges.reserve("apple"));
        assertEquals("a b c d", challenges.reserve("a b c d"));
        assertEquals("elbuod  decaps  sdrow", challenges.reserve("double  spaced  words"));
    }

    @Test
    public void testReserve2() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", challenges.reverse2("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", challenges.reverse2("apple"));
        assertEquals("a b c d", challenges.reverse2("a b c d"));
        assertEquals("elbuod  decaps  sdrow", challenges.reverse2("double  spaced  words"));
        assertEquals(" ", challenges.reverse2(" "));
        assertEquals("", challenges.reverse2("   "));
    }

    @Test
    public void testReserve3() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", challenges.reserv3("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", challenges.reserv3("apple"));
        assertEquals("a b c d", challenges.reserv3("a b c d"));
        assertEquals("elbuod  decaps  sdrow", challenges.reserv3("double  spaced  words"));
        assertEquals(" ", challenges.reserv3(" "));
//        assertEquals("", challenges.reserv3("   "));
    }
}