package strategy;

public class PaymentStrategy implements IPayment {

    private IPayment iPayment;

    public PaymentStrategy(IPayment iPayment) {
        this.iPayment = iPayment;
    }

    @Override
    public void pay(double amount) {
        iPayment.pay(amount);
    }
}
