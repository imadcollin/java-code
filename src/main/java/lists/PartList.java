package lists;

public class PartList {
        public static void main(String[] args) {
                divide();
        }

        public static String[][] divide() {
                                                /*
                                                a = ["az", "toto", "picaro", "zone", "kiwi"] -->
                                [["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
                                or
                                 a = {"az", "toto", "picaro", "zone", "kiwi"} -->
                                {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}}
                                or
                                a = ["az", "toto", "picaro", "zone", "kiwi"] -->
                                [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
                                or
                                a = [|"az", "toto", "picaro", "zone", "kiwi"|] -->
                                [("az", "toto picaro zone kiwi"), ("az toto", "picaro zone kiwi"), ("az toto picaro", "zone kiwi"), ("az toto picaro zone", "kiwi")]
                                or
                                                 */

                String[] ar = new String[] {"az", "toto", "picaro", "zone", "kiwi"};
                String[][] tu = new String[ar.length][ar.length];
                StringBuilder s = new StringBuilder();

                for (int i = 0; i < ar.length-1; i++) {

                       String str= "";
                        for (int j = 0; j <tu.length ; j++) {
                                for (int k = 0; k <tu.length ; k++) {

                                        str=str+" "+ar[k];
                                }
                                        tu[i][j]=str+ar[i];
                        }
                }



                for (int i = 0; i < ar.length-1; i++) {
                        for (int j = 0; j < tu.length; j++) {
                                System.out.print("["+i+"]["+j+"]"+":"+tu[i][j]);
                                System.out.println(" ");

                        }
                                System.out.println(" ");
                }
                return null;
        }

}
