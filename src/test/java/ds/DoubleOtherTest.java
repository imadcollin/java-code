package ds;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleOtherTest {

    @Test
    void doublletest() {
        DoubleOther doubleOther = new DoubleOther();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5);

        assertEquals(6, doubleOther.doubleScond(list).size());

        assertEquals(1, doubleOther.doubleScond(list).get(0));
        assertEquals(4, doubleOther.doubleScond(list).get(1));
        assertEquals(3, doubleOther.doubleScond(list).get(2));
        assertEquals(8, doubleOther.doubleScond(list).get(3));
    }

    @Test
    void doublletestTwo() {
        DoubleOther doubleOther = new DoubleOther();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5);

        assertEquals(6, doubleOther.doubletwo(list).size());

        assertEquals(1, doubleOther.doubletwo(list).get(0));
        assertEquals(4, doubleOther.doubletwo(list).get(1));
        assertEquals(3, doubleOther.doubletwo(list).get(2));
        assertEquals(8, doubleOther.doubletwo(list).get(3));
    }


}