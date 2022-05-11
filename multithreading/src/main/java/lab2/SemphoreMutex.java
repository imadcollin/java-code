package lab2;

import java.util.concurrent.Semaphore;

public class SemphoreMutex {
    static Semaphore semaphore = new Semaphore(1);

    static class MutexLock extends Thread {
        private String name;

        MutexLock(String name) {
            this.name = name;
        }

        public void run() {
            try {
                semaphore.acquire();
                try {
                    System.out.print(name + "\t");

                    for (int i = 0; i < 10; i++) {
                        System.out.print(i);
                    }
                    System.out.println();


                    Thread.sleep(100);
                } finally {
                    semaphore.release();
                    System.out.println("release lock");

                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MutexLock mutexLock1 = new MutexLock("A");
        MutexLock mutexLock2 = new MutexLock("B");
        MutexLock mutexLock3 = new MutexLock("C");
        MutexLock mutexLock4 = new MutexLock("D");

        mutexLock1.start();
        mutexLock2.start();
        mutexLock3.start();
        mutexLock4.start();

    }
}
