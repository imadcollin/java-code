package booleans;

public class Bonus {
    public static double checkBonus(double salary, boolean bonus) {
        return bonus ? salary * 10 : salary;
    }

    public static double checkBonus2(double salary, boolean bonus) {
        return (bonus ? 10 : 1) * salary;
    }
}
