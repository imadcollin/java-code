package multiThreading.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class serviceMain {
    public static void main(String[] args) {
        BlockingQueue<Messages> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("Factory started....");
    }
}
