package strategy;

public class Card extends Account implements IPayment {

    public Card(String name, double amount, String email) {
        super(name, email, amount);
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paying via Card, amount:" + amount);

    }
}
