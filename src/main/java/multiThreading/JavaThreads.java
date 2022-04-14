package multiThreading;

public class JavaThreads implements Runnable {
    public static int counter = 0;

    @Override
    public void run() {
        System.out.println("Thread is started:" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            addOne();
            System.out.println("Counter is:" + counter);

        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException.getMessage());
        }
        System.out.println("Thread is Ended:  " + Thread.currentThread().getName());

    }

    private void addOne() {
        System.out.println("Counter is:" + counter);
        counter++;
    }


}
