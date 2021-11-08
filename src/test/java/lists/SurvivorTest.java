package lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SurvivorTest {

    @Test
    public void test1() {
        Survivor.josephusPermutation(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1);
    }

    @Test
    public void test2() {
        Survivor.josephusPermutation(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
    }

    @Test
    public void test3() {
        Survivor.josephusPermutation(new Object[]{"C", "o", "d", "e", "W", "a", "r", "s"}, 4);
    }

    @Test
    public void test4() {
        Survivor.josephusPermutation(new Object[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    @Test
    public void test5() {
        Survivor.josephusPermutation(new Object[]{}, 3);
    }

}