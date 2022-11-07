package strategy;

public class Subtraction implements  ICalc{
    @Override
    public float calc(float a, float b) {
        return a-b;
    }
}
