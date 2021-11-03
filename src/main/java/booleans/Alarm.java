package booleans;

public class Alarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation ? true : false;
    }

    public static boolean setAlarm2(boolean employed, boolean vacation) {
        return employed ^ vacation ? employed : false;
    }

    public static boolean setAlarm3(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
