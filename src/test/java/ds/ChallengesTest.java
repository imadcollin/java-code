package ds;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test
    public void testRemove() {
        assertEquals("es", challenges.remove("test"));
        assertEquals("atin", challenges.remove("eating"));
        assertEquals("riv", challenges.remove("drive"));
        assertEquals("ovi", challenges.remove("covid"));
    }

    @Test
    public void testRemove2() {
        assertEquals("es", challenges.remove2("test"));
        assertEquals("atin", challenges.remove2("eating"));
        assertEquals("riv", challenges.remove2("drive"));
        assertEquals("ovi", challenges.remove2("covid"));
    }

    @Test
    public void evenTests() {
        assertEquals("es", challenges.getMiddle("test"));
        assertEquals("dd", challenges.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", challenges.getMiddle("testing"));
        assertEquals("A", challenges.getMiddle("A"));
    }


    @Test
    public void middlEevenTests() {
        assertEquals("es", challenges.getMidddle2("test"));
        assertEquals("dd", challenges.getMidddle2("middle"));
    }

    @Test
    public void middleOddTests() {
        assertEquals("t", challenges.getMidddle2("testing"));
        assertEquals("A", challenges.getMidddle2("A"));
    }

    @Test
    public void phoneNumber() {
        assertEquals("(123) 456-7890", challenges.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void phoneNumber2() {
        assertEquals("(123) 456-7890", challenges.phoneNu2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void getcount() {
        assertEquals(1, challenges.getCount("tests"));
        assertEquals(2, challenges.getCount("live"));
        assertEquals(3, challenges.getCount("area"));
    }


    private static void dotest(int[] ls, int[] expect) {
        int[] actual = challenges.sumParts(ls);
        assertArrayEquals(expect, actual);

    }

    private static void dotest2(int[] ls, int[] expect) {
        int[] actual = challenges.sumParts2(ls);
        assertArrayEquals(expect, actual);

    }

    private static void dotest3(int[] ls, int[] expect) {
        int[] actual = challenges.sumParts3(ls);
        assertArrayEquals(expect, actual);

    }

    @Test
    public void test() {
        //  dotest(new int[]{}, new int[]{0});
        dotest(new int[]{0, 1, 3, 6, 10}, new int[]{20, 20, 19, 16, 10, 0});
        dotest(new int[]{1, 2, 3, 4, 5, 6}, new int[]{21, 20, 18, 15, 11, 6, 0});
        dotest(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358},
                new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});

    }

    @Test
    public void testSumParts2() {
        //  dotest(new int[]{}, new int[]{0});
        dotest2(new int[]{0, 1, 3, 6, 10}, new int[]{20, 20, 19, 16, 10, 0});
        dotest2(new int[]{1, 2, 3, 4, 5, 6}, new int[]{21, 20, 18, 15, 11, 6, 0});
        dotest2(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358},
                new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});

    }

    @Test
    public void testSumParts3() {
        //  dotest(new int[]{}, new int[]{0});
        dotest3(new int[]{0, 1, 3, 6, 10}, new int[]{20, 20, 19, 16, 10, 0});
        dotest3(new int[]{1, 2, 3, 4, 5, 6}, new int[]{21, 20, 18, 15, 11, 6, 0});
        dotest3(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358},
                new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});

    }

    private double precision = 0.0000000000001;

    @Test
    public void testFindUnique() {
        assertEquals(1.0, challenges.findUnque(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, challenges.findUnque(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }


    @Test
    public void testUniqe() {
        assertEquals(1.0, challenges.findUn(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, challenges.findUn(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }

    @Test
    public void testpaintLetterboxes() {
        assertArrayEquals(new int[]{1, 9, 6, 3, 0, 1, 1, 1, 1, 1}, challenges.paintLetterboxes(125, 132));
    }

    @Test
    public void testpaintLetterboxesVersion2() {
        assertArrayEquals(new int[]{1, 9, 6, 3, 0, 1, 1, 1, 1, 1}, challenges.paintLetterboxesVersion2(125, 132));
    }
}
