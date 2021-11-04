package booleans;

class Orders {
    public static int counter = 0;

    public static void main(String[] args) {
        // solve("tft", "^&") = 2 as follow
        // ( (t ^ f ) & t)"= True
        // (t ^ (f & t))" = True

        solve("tft", "^&");
        System.out.println(counter);
    }

    public static void solve(String values, String op) {
        boolean[] booleansArr = new boolean[values.length()];
        for (int i = 0; i < booleansArr.length; i++) {
            if ((values.charAt(i)) == 't') booleansArr[i] = true;
            else if ((values.charAt(i)) == 'f') booleansArr[i] = false;
            else System.out.println("something wrong...!");
        }

        for (int i = 0; i < booleansArr.length; i++) {
            if (i < booleansArr.length - 1) {
                print(booleansArr[i], op.charAt(0), booleansArr[i + 1]);

            } else
                print(booleansArr[booleansArr.length - 1], op.charAt(op.length() - 1), booleansArr[booleansArr.length - 2]);

        }
    }

    public static void print(boolean en, char ch, boolean sec) {

        switch (ch) {
            case '&':
                System.out.print(en + " " + ch + " " + sec + ":" + (en & sec));
                if (en & sec) counter++;
                break;
            case '^':
                System.out.println(en + " " + ch + " " + sec + ":" + (en ^ sec));
                if (en ^ sec) counter++;
                break;
            default:
                System.out.println("Nothing to print... ! ");
        }
    }
}
