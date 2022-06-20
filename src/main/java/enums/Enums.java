package enums;

public class Enums {

    public enum Days {
        Sat("Sat"), Sun("Son"), Mon("Mån"), Tues("Tis"), Wed("Tor"), Thu("Tor"), Fri("Ons");

        public String swedish;

        private Days(String swedish) {
            this.swedish = swedish;
        }

    }


    public static void main(String[] args) {
        Days d = Days.Mon;
        System.out.println(d.name());
        System.out.println(d.swedish);

        plusDays(d.swedish);
        System.out.println(plusDays(d.swedish));
);

    }

    private static Days plusDays(String swedish) {
        if (isNotBlank(swedish))
            switch (swedish.toLowerCase()) {
                case "mon":
                    return Days.Tues;
                case "tues":
                    return Days.Wed;
                case "wed":
                    return Days.Thu;
                case "thur":
                    return Days.Fri;
                case "fri":
                    return Days.Sat;
                case "sat":
                    return Days.Sun;
                default:
                    return Days.Mon;
            }
        return null;
    }

    private static boolean isNotBlank(String swedish) {
        if ((swedish == null) ||
                (swedish.trim().length() == 0) || (swedish.trim().isEmpty())) return false;
        return true;
    }
}
