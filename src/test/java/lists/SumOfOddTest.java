package lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfOddTest {
    @Test
    void testSumOfTwoODds() {
        assertEquals(4, SumOfOdd.sumOFOdd(13));
    }

    @Test
    void testSumOfThreeODds() {
        assertEquals(4, SumOfOdd.sumOFOdd(123));
    }

    @Test
    void testSumOfFourODds() {
        assertEquals(9, SumOfOdd.sumOFOdd(1235));
    }

}