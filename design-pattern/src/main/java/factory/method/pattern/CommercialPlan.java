package factory.method.pattern;

public class CommercialPlan extends Plan{
    @Override
    public void getRate() {
        rate= 20;
    }

    @Override
    public void printBill() {
        System.out.println("Rate is 20! ");
    }
}
