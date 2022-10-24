package factory.method.pattern;

public abstract class Plan {
    protected double rate;

    public abstract void getRate();

    public abstract void printBill();

    public double calcBill(double unit) {
        return unit * rate;
    }
}
