package locking;

public class RaceCondition implements Runnable {
    private int counter = 0;

    private void incr() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        counter++;

    }

    private void decr() {
        counter--;
    }

    private int getVal() {
        return counter;
    }

    @Override
    public void run() {
        this.incr();
        System.out.println(Thread.currentThread().getName() + ":" + this.getVal());
        this.decr();
        System.out.println(Thread.currentThread().getName() + ":" + this.getVal());
    }

    public static void main(String[] args) {
        Number n1 = new Number();
        RaceCondition r = new RaceCondition();
        Thread thread1 = new Thread(r, "Thread 1");
        Thread thread2 = new Thread(r, "Thread 2");
        Thread thread3 = new Thread(r, "Thread 3");
        thread1.start();
        ;
        thread2.start();
        thread3.start();
    }
}
