package exercises;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountSown implements Runnable {
    private CountDownLatch count;

    public CountSown(CountDownLatch latch) {
        this.count = latch;
    }

    @java.lang.Override
    public void run() {
        System.out.println("Started...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count.countDown();
    }

    public static void main(String[] args) {
        CountDownLatch l = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 4; i++) {
            executorService.submit(new CountSown(l));
        }
        executorService.shutdown();
        try {
            l.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed..");
    }
}
