package exercises;

public class D extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        D th1 = new D();
        D th2 = new D();
        th1.start();
        th2.start();
        System.out.println("-------------------");
        for (int i = 0; i < 3; i++) {
            th1.yield();
            System.out.println(Thread.currentThread().getName() + ":" + i);

        }

    }
}
