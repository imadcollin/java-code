package booleans;

import java.math.BigInteger;

class Order {

        public static int counter = 0;

        public void BooleanOrder(final String operands, final String operators) {
            boolean[] booleansArr = new boolean[operands.length()];
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
        }

        public  void print(boolean en, char ch, boolean sec) {

            switch (ch) {
                case '&':
                    System.out.print(en + " " + ch + " " + sec + ":" + (en & sec));
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
                    System.out.println("Nothing to print... ! ");
            }
        }

        public BigInteger solve() {
            // Your code here
            return BigInteger.valueOf(counter);
        }
    }
}
