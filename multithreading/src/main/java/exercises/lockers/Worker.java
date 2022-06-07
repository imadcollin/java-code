package exercises.lockers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    private Random random = new Random();

    private final Object lock_1 = new Object();
    private final Object look_2 = new Object();

    private List<Integer> list_1 = new ArrayList();
    private List<Integer> list_2 = new ArrayList();

    public void stepOne() {
        synchronized (lock_1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        list_1.add(random.nextInt(100));
    }

    public void stepTwo() {
        synchronized (look_2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        list_2.add(random.nextInt(100));
    }

    public void execute() {
        for (int i = 0; i < 1000; i++) {
            stepOne();
            stepTwo();
        }
    }

    public void main() {
        System.out.println("........Starting the Process......");

        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                execute();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                execute();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time consumed:" + (end - start));
        System.out.printf(" List one size: %d, list two size: %d", list_1.size(), list_2.size());
    }
}
