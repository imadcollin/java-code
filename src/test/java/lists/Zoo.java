package lists;

public class Zoo {
    public static String[] fixTheMeerkat(String[] arr) {
        //Wrong [tail, body,head]
        //Correct [head,body,tail]
        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        return arr;
    }

    public static String[] fix2(String[] arr) {
        return new String[]{arr[2], arr[1], arr[0]};
    }
}
