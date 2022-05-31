package exercises;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Stat {

    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread2.start();

        Thread.sleep(30000);
        System.exit(0);

    }

    public static void producer() throws InterruptedException {
        Random random = new Random();
        while (true) {
        System.out.println("Adding: "+ random.nextInt(100));
            queue.put(random.nextInt(100));
        }
    }

    public static void consumer() throws InterruptedException {
        Random rand = new Random();

        while (true) {
            Thread.sleep(100);
            if (rand.nextInt(10) == 0) {
                Integer val = queue.take();
                System.out.println("Taking: " + val);
            }
        }
    }
}
