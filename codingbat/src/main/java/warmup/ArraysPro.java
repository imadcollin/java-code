package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysPro {

    public boolean isSixOrFirst(int[] nums) {
        if (nums.length != 0) {
            return nums[0] == 6 || nums[nums.length - 1] == 6;
        }
        return false;
    }

    @Test
    void testSixEl() {
        assertEquals(true, isSixOrFirst(new int[]{6, 2, 3, 4, 3}));
        assertEquals(false, isSixOrFirst(new int[]{2, 3, 4, 3}));
        assertEquals(true, isSixOrFirst(new int[]{2, 3, 4, 3, 6}));
    }

    public int[] makeMiddle(int[] nums) {
        if (nums.length != 0 && nums.length % 2 == 0) {
            return new int[]{nums[(nums.length / 2) - 1], nums[(nums.length / 2)]};
        }
        return null;
    }

    @Test
    void dtestMiddle() {
        assertEquals(2, makeMiddle(new int[]{1, 2, 3, 4})[0]);
        assertEquals(3, makeMiddle(new int[]{1, 2, 3, 4})[1]);
        assertEquals(1, makeMiddle(new int[]{1, 2})[0]);
        assertEquals(2, makeMiddle(new int[]{1, 2})[1]);
    }

    public boolean unlucky1(int[] nums) {
        int idx = findIndx(nums, 1);
        if (nums.length > 0) {
            for (int i = idx; i < nums.length; i++) {
                if (nums[i] == 1)
                    return false;

            }

        }
        return true;
    }

    private int findIndx(int[] nums, int i) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i) return nums[j];
        }
        return 0;
    }

    @Test
    void testUnluckly1() {
        assertEquals(true, unlucky1(new int[]{1, 2, 3, 4}));
        assertEquals(false, unlucky1(new int[]{1, 2, 3, 4, 1}));
        assertEquals(false, unlucky1(new int[]{1, 3, 1}));
    }
}
