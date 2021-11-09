package booleans;

import java.math.BigInteger;

class BooleanOrder {
    public static int counter = 0;

    public BooleanOrder(final String operands, final String operators) {
      /*  boolean[] booleansArr = new boolean[operands.length()];
        for (int i = 0; i < booleansArr.length; i++) {
            if ((operands.charAt(i)) == 't') booleansArr[i] = true;
            else if ((operands.charAt(i)) == 'f') booleansArr[i] = false;
            else System.out.println("something wrong...!");
        }

        for (int i = 0; i < booleansArr.length; i++) {
            if (i < booleansArr.length - 1) {
                print(booleansArr[i], operators.charAt(0), booleansArr[i + 1]);

            } else
                print(booleansArr[booleansArr.length - 1], operators.charAt(operators.length() - 1), booleansArr[booleansArr.length - 2]);

        }
       */
    }

    public void BooleanOrder(final String operands, final String operators) {
        boolean[] operandsArr = sortedArr(operands);


        for (int i = 0; i < operandsArr.length; i++) {
            for (int j = 0; j < operators.length(); j++) {
                if (i < operandsArr.length - 1) {
                    print(operandsArr[i], operators.charAt(0), operandsArr[i + 1]);
                } else
                    print(operandsArr[operandsArr.length - 1], operators.charAt(operators.length() - 1), operandsArr[operandsArr.length - 2]);

            }
        }
    }

    public boolean[] sortedArr(String operands) {
        boolean[] booleansArr = new boolean[operands.length()];
        for (int i = 0; i < booleansArr.length; i++) {
            if ((operands.charAt(i)) == 't') booleansArr[i] = true;
            else if ((operands.charAt(i)) == 'f') booleansArr[i] = false;
            else System.out.println("something wrong...!");
        }
        return booleansArr;
    }

    public void print(boolean en, char ch, boolean sec) {

        switch (ch) {
            case '&':
                System.out.println(en + " " + ch + " " + sec + ":" + (en & sec));
                if (en & sec) counter++;
                break;
            case '^':
                System.out.println(en + " " + ch + " " + sec + ":" + (en ^ sec));
                if (en ^ sec) counter++;
                break;
            case '|':
                if (en | sec) counter++;
                System.out.println(en + " " + ch + " " + sec + ":" + (en | sec));

            default:
                System.out.println("Nothing to print... ! " + ch);
        }
    }

    public BigInteger solve() {
        return BigInteger.valueOf(counter);
    }
}