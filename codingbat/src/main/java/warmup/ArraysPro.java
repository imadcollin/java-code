package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0) {
            return nums[0] == nums[nums.length - 1];
        }
        return false;
    }

    @Test
    void testSameFirstLast() {
        assertEquals(true, sameFirstLast(new int[]{2, 3, 4, 5, 2}));
        assertEquals(false, sameFirstLast(new int[]{2, 3, 4, 5}));
        assertEquals(true, sameFirstLast(new int[]{3, 4, 5, 2, 3, 3}));
    }

    public int[] make2(int[] a, int[] b) {
        int first = 0, second = 0;
        if (a.length == 1) {
            first = a[0];
            second = b[0];
        }

        if ((a.length >= 2) && (b.length >= 2)) {
            first = a[0];
            second = a[1];
        }
        if (a.length == 0) {
            first = b[0];
            second = b[1];
        }
        if (b.length == 0) {
            first = a[0];
            second = a[1];
        }

        return new int[]{first, second};
    }

    @Test
    void testMake2() {
        assertArrayEquals(make2(new int[]{4, 5}, new int[]{1, 2, 3}), new int[]{4, 5});
        assertArrayEquals(make2(new int[]{4}, new int[]{1, 2, 3}), new int[]{4, 1});
        assertArrayEquals(make2(new int[]{}, new int[]{1, 2}), new int[]{1, 2});
    }

    public int[] biggerTwo(int[] a, int[] b) {

        /*
          int x=0,y=x;

        if(a[0]> b[0] && a[1]>b[1]){
          x=a[0];
          y=a[1];
        }
          */
        if (a[0] > b[0] || a[1] > b[1])
            return new int[]{a[0], a[1]};
        else
            return new int[]{b[0], b[1]};
    }

    @Test
    void testBigTwo() {
        assertArrayEquals(biggerTwo(new int[]{1, 2}, new int[]{3, 4}), new int[]{3, 4});
        assertArrayEquals(biggerTwo(new int[]{3, 4}, new int[]{1, 2}), new int[]{3, 4});
        assertArrayEquals(biggerTwo(new int[]{1, 1}, new int[]{1, 2}), new int[]{1, 2});
    }
}
