package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Recursion {
    public int fact(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return n * fact(n - 1);
    }

    @Test
    void testFact() {
        assertEquals(fact(1), 1);
        assertEquals(fact(2), 2);
        assertEquals(fact(3), 6);
        assertEquals(fact(4), 24);
        assertEquals(fact(5), 120);
    }

    public int boonies(int num) {
        if (num == 0) return 0;
        if (num == 1) return 2;
        if (num % 2 == 0) return 3 + boonies(num - 1);
        if (num % 2 != 0) return 2 + boonies(num - 1);
        return 0;

    }

    @Test
    void testBoonies() {
        assertEquals(boonies(2), 5);
        assertEquals(boonies(3), 7);
        assertEquals(boonies(5), 12);
        assertEquals(boonies(10), 25);
    }
}
