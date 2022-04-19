package multiThreading.queue;

import java.util.Objects;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Messages> queue;

    public Consumer(BlockingQueue<Messages> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        try {
            Messages messages;
            while (!Objects.equals(queue.take().getMsg(), "99")) {
                Thread.sleep(10);
                System.out.println("Consumered:" + queue.take().getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
