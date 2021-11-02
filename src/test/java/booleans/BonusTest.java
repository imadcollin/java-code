package booleans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusTest {

    @Test
    public void bonusTest() {
        assertEquals(Bonus.checkBonus(10, true), 100);
        assertEquals(Bonus.checkBonus(10, false), 10);
        assertEquals(Bonus.checkBonus(20, true), 200);
    }

    @Test
    public void bonus2Test() {
        assertEquals(Bonus.checkBonus2(10, true), 100);
        assertEquals(Bonus.checkBonus2(10, false), 10);
        assertEquals(Bonus.checkBonus2(20, true), 200);
    }
}