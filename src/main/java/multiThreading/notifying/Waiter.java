package multiThreading.notifying;

public class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println("Waiting for message time is:" + System.currentTimeMillis());

            Thread.sleep(1000);
            synchronized (message) {
                message.setMsg(name + " Notifier ");
                message.notify();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Waiting for notifying ... time:" + System.currentTimeMillis());
        System.out.println(name + "working on:" + message.getMsg());
    }
}
