package exceptions;

public class CustomExe extends Exception {
    public CustomExe(String errorMsg) {
        super(errorMsg);
    }

    static boolean checkNameWithCap(String name) throws CustomExe {
        if (name.length() > 0) {
            char firstChar = name.charAt(0);
            if (Character.isUpperCase(firstChar)) {
                return true;
            }
            throw new CustomExe("no starting with capital ..");

        }
        return false;
    }

    public static void main(String[] args) throws CustomExe {

        System.out.println(checkNameWithCap("Atest"));
        System.out.println(checkNameWithCap("test"));
    }
}
