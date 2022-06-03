package exercises;

import java.util.concurrent.locks.ReentrantLock;

public class Reat extends Thread {
    private ReentrantLock reentrantLock = new ReentrantLock();
    private int count = 0;

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                increment();
                increment();
                dec();
                printCount();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void increment() {
        reentrantLock.lock();
        try {
            count++;
        } finally {
            reentrantLock.unlock();
        }

    }

    public void dec() {
        count--;
    }

    public void printCount() {
        System.out.println("count is: " + count);
    }

    public static void main(String[] args) {
        Reat t1 = new Reat();
        Reat t2 = new Reat();

        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            t1.increment();
            t1.printCount();
        }

        for (int i = 0; i < 10; i++) {
            t2.increment();
            t2.printCount();
        }
    }
}
