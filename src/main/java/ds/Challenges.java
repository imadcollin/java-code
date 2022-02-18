package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public static String createPhoneNumber(int[] numbers) {
        int len = numbers.length;
        StringBuilder s = new StringBuilder();
        s.append("(");
        for (int i = 0; i < len; i++) {
            if (i == 3)
                s.append(") ");
            s.append(numbers[i]);
            if (i == 5)
                s.append("-");

        }
        return s.toString();
    }

    public String phoneNu2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    public int getCount(String str) {
        if (str.length() == 0) return 0;
        char stringChar[] = str.toCharArray();
        int count = 0;
        for (char c : stringChar
        ) {
            if (c == 'a' || c == 'u' || c == 'u' || c == 'e' || c == 'i') count++;
        }

        return count;
    }

    public int[] sumParts(int[] arr) {
        int parts[] = new int[arr.length + 1];
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = counter; j < arr.length; j++) {
                sum += arr[j];
            }
            counter++;
            parts[i] = sum;
            sum = 0;
        }
        return parts;
    }

    public int[] sumParts2(int[] ls) {
        List<Integer> collect = new ArrayList();
        int start = 0;
        int sum = 0;
        for (Integer i : ls
        ) {
            for (int j = start; j < ls.length; j++) {
                sum += ls[j];
            }
            start++;
            collect.add(sum);
            sum = 0;
        }
        collect.add(0);
        return collect.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] sumParts3(int[] ls) {
        int arr[] = new int[ls.length + 1];
        for (int i = ls.length - 1; i >= 0; i--) {
            arr[i] = arr[i + 1] + ls[i];
        }
        return arr;
    }

    public double findUnque(double arr[]) {
        if (arr[0] != arr[1] && arr[0] != arr[2]) return arr[0];
        for (double el : arr
        ) {
            if (el != arr[0])
                return el;

        }
        return 0;
    }

    public double findUn(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    public static int[] paintLetterboxes(final int start, final int end) {
        int counters[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arr = new int[end - start];
        for (int i = start; i < end; i++) {
            arr = get(counters, i, arr);
        }

        return arr;
    }

    public static int[] get(int[] arr, int num, int[] fin) {
        int digit = num;
        while (digit > 10) {

            digit = digit / 10;
        }
        int inc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) fin[i] = fin[i] + 1;

            num = num % 10;
        }

        return fin;
    }

}
