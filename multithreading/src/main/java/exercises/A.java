package exercises;

public class A extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            A a = new A();
            a.start();
        }
        System.out.println("-------------");
        for (int i = 0; i < 5; i++) {
            Thread th = new Thread(new A_run());
            th.start();
        }
    }

    public static class A_run implements Runnable {
        @java.lang.Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");

        }

    }

}
