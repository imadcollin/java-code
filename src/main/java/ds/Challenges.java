package ds;

public class Challenges {

    public static void main(String[] args) {
        System.out.println(reserve("one two three"));

    }

    public static String reserve(String str) {
        char[] arr = new char[str.length()];
        String reversie = "";
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {

            arr[i] = str.charAt(i);
        }

        String s = "";
        for (int w = 0; w < arr.length; w++) {
            if (Character.isWhitespace(arr[w])) {
                flag = true;

            }
            if (flag == false)
                s += arr[w];
            if (flag) {

                reversie += swap(s) + " ";
                s = "";
                flag = false;
            }

        }
        reversie += swap(s) + " ";

        return reversie;
    }

    public static String swap(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
}
