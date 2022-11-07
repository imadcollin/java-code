package strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MAin {
    @Test
    public void testAddition() {
        Strategy strategy = new Strategy(new Addition());
        Assertions.assertEquals(40, strategy.executor(30, 10));
    }

    @Test
    public void testSub() {
        Strategy strategy = new Strategy(new Subtraction());
        Assertions.assertEquals(20, strategy.executor(30, 10));
    }

    @Test
    public void testDivision() {
        Strategy strategy = new Strategy(new Division());
        Assertions.assertEquals(3, strategy.executor(30, 10));
    }
}
