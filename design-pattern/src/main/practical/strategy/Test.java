package strategy;

public class Test {
    public static void main(String[] args) {
        Card card = new Card("MyAccount", 2000, "xxxx@gamil.com");
        Paypal paypal = new Paypal("Paypal", 5000, "yyy@gmailco");
        PaymentStrategy paymentStrategy = new PaymentStrategy(card);
        paymentStrategy.pay(250);

        paymentStrategy = new PaymentStrategy(paypal);
        paymentStrategy.pay(222);

    }
}
