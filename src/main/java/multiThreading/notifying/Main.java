package multiThreading.notifying;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("message 1");

        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "waitier1").start();

        Waiter waiter2 = new Waiter(message);
        new Thread(waiter2, "waiter2").start();

        Notifyer notifyer = new Notifyer(message);
        new Thread(notifyer, "notfier").start();
        System.out.println("Starting ..... ");
    }
}
