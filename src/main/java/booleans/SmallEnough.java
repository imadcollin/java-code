package booleans;

public class SmallEnough {

    public static boolean isSmallEnough(int[] a, int limit) {
        boolean check = false;
        for (int x : a
        ) {
            if (x < limit || x == limit) {
                check = true;
            } else check = false;
        }
        return check;
    }
    public  static  boolean isSmallEnough2(int []a, int limit){
       return java.util.Arrays.stream(a).noneMatch(i-> i > limit);
    }
}
