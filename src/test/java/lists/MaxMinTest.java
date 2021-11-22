package lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {
    @Test
    public void test_max() {
        assertEquals(MaxMin.Max(new int[]{1, 2, 3, 4, 5, 7, 6}), 7);
        assertEquals(MaxMin.Max(new int[]{1, 2, 3, 4, 5, 7, 6, 55, 33, 22}), 55);
    }

    @Test
    public void test_max2() {
        assertEquals(MaxMin.Max2(new int[]{1, 2, 3, 4, 5, 7, 6}), 7);
        assertEquals(MaxMin.Max2(new int[]{1, 2, 3, 4, 5, 7, 6, 55, 33, 22}), 55);
    }

    @Test
    public void test_max3() {
        assertEquals(MaxMin.Max3(new int[]{1, 2, 3, 4, 5, 7, 6}), 7);
        assertEquals(MaxMin.Max3(new int[]{1, 2, 3, 4, 5, 7, 6, 55, 33, 22}), 55);
    }
}