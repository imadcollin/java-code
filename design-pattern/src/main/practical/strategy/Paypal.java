package strategy;

public class Paypal extends Account implements IPayment {
    public Paypal(String name, double amount, String email) {
        super(name, email, amount);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying via Paypal, amount:" + amount);
    }
}
