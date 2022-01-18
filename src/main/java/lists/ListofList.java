package lists;


import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ListofList {

    public static void main(String[] args) {
        Integer[][] x = {{1, 2, 3}, {5, 6, 7}};
        test(e -> e + 1, x);
        System.out.println(Arrays.deepToString(test(e -> e + 1, x)));
        System.out.println(Arrays.deepToString(test2(e -> e + 1, x)));
        System.out.println(Arrays.deepToString(test3(e -> e + 1, x)));
    }

    public static <T, R> Object[][] gridMap(Function<T, R> fn, T[][] list) {

        return null;
    }

    public static <T, R> Object[][] test(Function<T, R> fn, T[][] list) {
        return Arrays.stream(list).map(x -> Arrays.stream(x).map(fn).toArray()).toArray(Object[][]::new);
    }

    public static <T, R> Object[][] test2(Function<T, R> fn, T[][] list) {
        R[][] res = (R[][]) new Object[list.length][];
        for (int i = 0; i < list.length; i++) {
            res[i] = (R[]) new Object[list[i].length];
            for (int j = 0; j < list[i].length; j++) {

                res[i][j] = fn.apply(list[i][j]);
            }
        }
        return res;
    }

    public static <T, R> Object[][] test3(Function<T, R> fn, T[][] list) {
        return Arrays.stream(list).map(e -> Arrays.stream(e).map(fn).toArray(Object[]::new)).toArray(Object[][]::new);
    }

    public static List<Integer> getOneList(List<List<Integer>> list2){
        return list2.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static List<Integer> getOneList2(List<List<Integer>> lists){
        List<Integer> mergedList = new ArrayList<>();
        for (List<Integer> list : lists
             ) {
            mergedList.addAll(list);
        }
        return mergedList;
    }

}

