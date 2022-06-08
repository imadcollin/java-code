package exercises.lockers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Syncaer {
    private Random random = new Random();
    private Object obj_1 = new Object();
    private Object obj_2 = new Object();

    private List<Integer> list_1 = new ArrayList<>();
    private List<Integer> list_2 = new ArrayList<>();

    public void main() {
        long start = System.currentTimeMillis();
        Thread thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                execute();
            }
        });

        Thread thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                execute();
            }
        });
        thread_1.start();
        thread_2.start();

        try {
            thread_1.join();
            thread_2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time consumed:" + (end - start));
        System.out.printf(" List one size: %d, list two size: %d", list_1.size(), list_2.size());
    }

    private void execute() {
        for (int i = 0; i < 100; i++) {
            stepOne();
            stepTwo();
        }
    }

    private synchronized void stepTwo() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list_1.add(random.nextInt(1));
    }

    private synchronized void stepOne() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list_2.add(random.nextInt(100));
    }

}
