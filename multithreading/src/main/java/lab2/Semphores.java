package lab2;

import java.util.concurrent.Semaphore;

public class Semphores extends Thread {
    private String name;
    Semaphore semaphore = new Semaphore(3);

    public Semphores(String name) {
        this.name = name;
    }

    public void run() {

        try {
            semaphore.acquire();
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + "::" + i);
                    Thread.sleep(100);
                }
                System.out.println();

            } finally {
                semaphore.release();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Semphores a = new Semphores("A ");
        Semphores b = new Semphores("B ");
        Semphores c = new Semphores("C ");
        Semphores d = new Semphores("D ");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
