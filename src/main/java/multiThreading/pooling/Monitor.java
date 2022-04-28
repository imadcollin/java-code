package multiThreading.pooling;

import java.util.concurrent.ThreadPoolExecutor;

public class Monitor implements Runnable {
    private ThreadPoolExecutor executor;
    private int second;
    private boolean run = true;

    public Monitor(ThreadPoolExecutor executor, int delay) {
        this.executor = executor;
        this.second = delay;
    }

    public void shutDown() {
        this.run = false;
    }

    @Override
    public void run() {
        while (run) {
            System.out.println(
                    String.format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                            this.executor.getPoolSize(),
                            this.executor.getCorePoolSize(),
                            this.executor.getActiveCount(),
                            this.executor.getCompletedTaskCount(),
                            this.executor.getTaskCount(),
                            this.executor.isShutdown(),
                            this.executor.isTerminated()));
        }
        try {
            Thread.sleep(second / 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
