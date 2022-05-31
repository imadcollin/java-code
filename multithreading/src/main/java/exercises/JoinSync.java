package exercises;

public class JoinSync {
    private int count = 0;

    public static void main(String[] args) {
        JoinSync joinSync = new JoinSync();
        joinSync.work();

    }

    public void work() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                incr(Thread.currentThread().getName());
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                incr(Thread.currentThread().getName());
            }
        });
        thread2.start();
    }

    public synchronized void incr(String name) {
        count++;
        System.out.println(name + " count:" + count);
    }
}
