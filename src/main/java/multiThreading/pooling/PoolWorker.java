package multiThreading.pooling;

public class PoolWorker implements Runnable {
    private String command;

    public PoolWorker(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return this.command;
    }

    @Override
    public void run() {
        System.out.println("Thread Started:" + Thread.currentThread().getName());

        doStuff();
        System.out.println("Thread Ended:" + Thread.currentThread().getName());

    }

    private void doStuff() {
        System.out.println("Thread Doing Stuff....");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
