package lab3;

import java.util.concurrent.Semaphore;

public class PhilosopherMutex {
    private static PhilosopherMutex[] phs = new PhilosopherMutex[5];

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
            return mutex.availablePermits() > 0;
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
                System.out.println("Grapping left");

                right.grab();
                System.out.println("Grapping right");

                eat()
                left.release();
                right.release();
                System.out.println("Releasing left and right");

            }
        }

        private void eat() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
