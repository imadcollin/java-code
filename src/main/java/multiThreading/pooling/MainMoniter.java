package multiThreading.pooling;

import java.util.concurrent.*;

public class MainMoniter {
    public static void main(String[] args) throws InterruptedException {
        RejectHandler rejectHandler = new RejectHandler();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectHandler);
        Monitor monitor = new Monitor(threadPoolExecutor, 2);
        Thread m = new Thread(monitor);
        m.start();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new PoolWorker("" + i));

        }
        Thread.sleep(1000);
        threadPoolExecutor.shutdown();
        Thread.sleep(1000);
        monitor.shutDown();
    }


}
