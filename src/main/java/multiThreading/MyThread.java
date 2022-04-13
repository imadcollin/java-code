package multiThreading;

public class MyThread extends Thread {
    public static int counter = 0;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is running ..... ");
        try {
            Thread.sleep(1000);
            addOne();
            System.out.println("Counter is:" + counter);

        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException.getMessage());
        }
        System.out.println("Thread is working  ..... Name:  " + Thread.currentThread().getName());

    }

    private void addOne() {
        System.out.println("Counter is:" + counter);
        counter++;
    }
}
