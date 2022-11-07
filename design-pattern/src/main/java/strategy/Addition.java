package strategy;

public class Addition implements  ICalc{
    @Override
    public float calc(float a, float b) {
        return a + b;
    }
}
