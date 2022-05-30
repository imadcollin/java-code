package exercises;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Stat {

    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {


    }

    public static void producer() throws InterruptedException {
        Random random = new Random();
        while (true) {
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
