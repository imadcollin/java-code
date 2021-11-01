package booleans;

public class BooleanToString {

    public static void main(String[] args) {
        System.out.println(boolToString(true));
        System.out.println(boolToString(false));
    }

    public static String boolToString(boolean val) {

        return val == true ? "true" : "false";
    }
}
