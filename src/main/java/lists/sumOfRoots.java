package lists;

public class sumOfRoots {

    public static int sum(int n) {
        String str = "" + n;
        int sum = 0;
        int divider = 0;

        switch (str.length()) {
            case 1:
                return n;
            case 2:
                divider = n % 10;
                n = n / 10;
                return n + divider + sum;
            default:
                while (n > 9) {
                    divider = n % 10;
                    n = n / 10;
                    sum = sum + divider;
                }
                return sum + n;

        }

    }

}

