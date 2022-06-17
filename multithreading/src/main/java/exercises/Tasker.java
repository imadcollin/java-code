package exercises;

import java.util.ArrayList;
import java.util.List;

public class Tasker extends Thread {
    private static List<Integer> integerList = new ArrayList<>();

    public void producer() throws InterruptedException {
        synchronized (this) {
            while (integerList.size() == 100) wait();
            for (int i = 0; i <= 200; i++) {
                integerList.add(i);
                System.out.println("Adding: " + i);
            }
            notify();
            Thread.sleep(2000);
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (this) {
            while (integerList.size() == 0) wait();
            for (int i = 0; i <= 100; i++) {
                integerList.remove(i);
                System.out.println("Removing: " + i);
            }
            notify();
            Thread.sleep(2000);
        }
    }

    public static void main(String[] args) {
        Tasker tasker = new Tasker();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    tasker.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @java.lang.Override
            public void run() {
                try {
                    tasker.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

    }
}
