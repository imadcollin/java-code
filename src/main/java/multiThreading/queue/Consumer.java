package multiThreading.queue;

import java.util.Objects;
import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable {
    private BlockingDeque<Messages> queue;

    public Consumer(BlockingDeque<Messages> q) {
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
