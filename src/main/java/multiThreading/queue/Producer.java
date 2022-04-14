package multiThreading.queue;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Producer implements Runnable {
    private BlockingDeque<Messages> queue;

    public Producer(BlockingDeque<Messages> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        List<Messages> messages = IntStream.range(0, 100).boxed().map(x -> new Messages(String.valueOf(x))).collect(Collectors.toList());

        int idx = 0;
        for (Messages massage : messages
        ) {
            try {
                Thread.sleep(idx++);
                queue.put(massage);
                System.out.println("Producer msg:" + massage.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
