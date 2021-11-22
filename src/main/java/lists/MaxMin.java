package lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static int Max(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }

    public static int Max2(int[] arr) {

        return Arrays.stream(arr).max().orElse(0);
    }

    public static int Max3(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
