package lists;

public class SumOfOdd {
    public static void main(String[] args) {
        System.out.println(sumOFOdd(123));
    }

    public static int sumOFOdd(int n) {
        int sum = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c % 2 != 0) {
                sum = sum + Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
}
