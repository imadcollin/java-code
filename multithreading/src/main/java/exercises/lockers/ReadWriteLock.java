package exercises.lockers;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteL {
    ReadWriteLock lock = new ReentrantReadWriteLock();

    private int count = 0;

    public int incr() {
        lock.writeLock().lock();

        try {
            count++;
            return count;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int getCount() {
        lock.readLock().lock();
        try {
            return count;
        } finally {
            lock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteL readWriteL = new ReadWriteL();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    readWriteL.incr();

                }
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    readWriteL.getCount();

                }
            }
        });
        reader.start();
        System.out.println(readWriteL.getCount());
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    readWriteL.incr();

                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            reader.join();

        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println(readWriteL.getCount());
    }
}

