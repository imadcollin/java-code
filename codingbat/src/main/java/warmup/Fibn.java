package warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Fibn {

    public static int sumFun(int n) {
        int[] finArr = new int[n];
        int sum = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            finArr[i] = i;
        }
        for (int i = 0; i < finArr.length - 1; i++) {
            num = finArr[i] + finArr[i + 1];
            sum += num;
            System.out.println(num);
        }
        return sum;
    }


    public static List<Integer> func(int n) {

        int first = 0;
        int temp = 0;
        int num = 0;
        List<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                temp = i;
                list.add(1);
            } else {
                first = temp;
                num = first + i;
                temp = i;
                list.add(num);
            }
        }
        return list;
    }

    @Test
    public void testFunc() {
        Assertions.assertEquals(3, func(3).size());
        Assertions.assertEquals(4, func(4).size());
        Assertions.assertEquals(1, func(3).get(0));
        Assertions.assertEquals(1, func(3).get(1));
        Assertions.assertEquals(3, func(3).get(2));
        Assertions.assertEquals(5, func(4).get(3));
    }

    @Test
    public void testFun() {
        Assertions.assertEquals(4, sumFun(3));
        Assertions.assertEquals(9, sumFun(4));
        Assertions.assertEquals(16, sumFun(5));
    }
}
