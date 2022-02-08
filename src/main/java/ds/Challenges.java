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

    public String remove(String str) {
        String s = "";
        for (int i = 1; i < str.length() - 1; i++) {
            s += str.charAt(i);
        }
        return s;
    }

    public String remove2(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String getMiddle(String word) {
        char[] arr = new char[word.length()];
        int len = word.length();
        int mid = len / 2;

        String s = "";
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
        }

        if (len % 2 == 0) {
            s = "" + arr[mid - 1] + arr[mid];
        }
        if (len % 2 != 0) {
            s = "" + arr[mid];
        }
        return s;
    }

    public String getMidddle2(String word) {
        if (word.length() == 0) return "";

        int len = word.length();
        if (len % 2 == 0) {
            int mid = len / 2;
            return word.substring(mid - 1, mid + 1);
        }
        return "" + word.charAt((len / 2));
    }
}
