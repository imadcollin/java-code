package lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{"head", "body", "tail"},
                Zoo.fixTheMeerkat(new String[]{"tail", "body", "head"}));
               Zoo.fix2(new String[]{"tail", "body", "head"});

    }


    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{"heads", "body", "tails"},
                Zoo.fixTheMeerkat(new String[]{"tails", "body", "heads"}));
                Zoo.fix2(new String[]{"tails", "body", "heads"});


    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{"top", "middle", "bottom"},
                Zoo.fixTheMeerkat(new String[]{"bottom", "middle", "top"}));
                Zoo.fix2(new String[]{"bottom", "middle", "top"});

    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{"upper legs", "torso", "lower legs"},
                Zoo.fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs"}));
                Zoo.fix2(new String[]{"lower legs", "torso", "upper legs"});

    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{"sky", "rainbow", "ground"},
                Zoo.fixTheMeerkat(new String[]{"ground", "rainbow", "sky"}));
                Zoo.fix2(new String[]{"ground", "rainbow", "sky"});

    }
}