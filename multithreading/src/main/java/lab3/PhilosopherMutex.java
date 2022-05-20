package lab3;

import java.util.concurrent.Semaphore;

public class PhilosopherMutex {
    private static Ph[] phs = new Ph[5];
    private static Fork[] forks = new Fork[5];

    static class Fork {
        public Semaphore mutex = new Semaphore(1);

        void grab() {
            try {
                mutex.acquire();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        void release() {
            mutex.release();
        }

        boolean checkStatus() {
            return mutex.availablePermits() > 1;
        }

    }

    static class Ph extends Thread {
        public Fork left;
        public Fork right;

        Ph(Fork left, Fork right) {
            this.left = left;
            this.right = right;
        }

        public void run() {
            while (true) {
                left.grab();
                System.out.println("Picking left");

                right.grab();
                System.out.println("Picking right");

                eat();
                left.release();
                right.release();
                System.out.println("Releasing left and right");

            }
        }

        private void eat() {
            try {
                Thread.sleep(2000);
                System.out.println(".......EATING........");

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    public static void main(String[] args) {
        Fork f = new Fork();
        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork();
        }

        for (int i = 0; i < 5; i++) {
            phs[i] = new Ph(forks[i], forks[((i + 1) % phs.length)]);
            phs[i].start();
        }

        while (true) {
            try {
                boolean deadLock = true;
                for (Fork fork : forks
                ) {
                    if (fork.checkStatus()) deadLock = false;
                    break;

                }

                if (deadLock) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("something went wrong...");

            }
        }
    }
}


