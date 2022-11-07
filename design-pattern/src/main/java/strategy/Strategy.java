package strategy;

public class Strategy {
    private ICalc iCalc;

    public Strategy(ICalc iCalc) {
        this.iCalc = iCalc;
    }

    public float executor(float a, float b) {
        return iCalc.calc(a, b);
    }
}
