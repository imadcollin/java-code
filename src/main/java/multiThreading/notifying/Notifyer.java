package multiThreading.notifying;

public class Notifyer implements Runnable {
    private Message message;

    public Notifyer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (message) {
            try {
                Thread.sleep(1000);
                message.wait();

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name + " is waiting time:" + System.currentTimeMillis());
            System.out.println(name + "Processing:" + message.getMsg());
        }
    }
}
