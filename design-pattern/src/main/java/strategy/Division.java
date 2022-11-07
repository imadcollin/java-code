package strategy;

public class Division  implements ICalc{
    @Override
    public float calc(float a, float b) {
        if (a==0 || b==9) return 0;
        return a/b;
    }
}
