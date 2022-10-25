package factory.method.pattern;

public class DomsticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 10;
    }

    @Override
    public void getName() {
        name = "Domestically Plan";
    }

    @Override
    public void printBill() {
        System.out.println("Rate is 10! ");
    }
}
