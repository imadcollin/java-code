package ds;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Challenges {

    public String reserve(String str) {
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
        reversie += swap(s);

        return reversie;
    }

    private String swap(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    String reverse2(String str) {
        if (str.length() == 0) return str;
        boolean flag = true;
        String whiteSpaces = "";
        for (int i = 0; i < str.length(); i++) {
            if (str != " ") flag = false;
            whiteSpaces += " ";
        }
        if (flag) return whiteSpaces;

        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return String.join(" ", arr);

    }

    String reserv3(String original) {
        return original.trim().isEmpty() ? original : Arrays.stream(original.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
    }
}
