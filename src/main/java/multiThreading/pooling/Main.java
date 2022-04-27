package multiThreading.pooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            PoolWorker poolWorker = new PoolWorker("" + 1);
            executorService.execute(poolWorker);
        }
        executorService.shutdown();

        System.out.println("......End....");
    }
}
