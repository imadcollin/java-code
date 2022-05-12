package lab2;

public class Deadlocks extends Thread {
    private String name;
    static final String resource1 = "resource 1";
    static final String resource2 = "resource 2";

    public Deadlocks(String name) {
        this.name = name;
    }

    public void run() {
        try {
            synchronized (resource1) {
                System.out.println(this.name + "-> locked resource 1 ");

            }
            Thread.sleep(1000);
            synchronized (resource2) {
                System.out.println(this.name + "-> locked resource 2 ");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static class Deadlocks2 extends Thread {


        public Deadlocks2(String name) {
            this.setName(name);
        }

        public void run() {
            try {
                synchronized (resource1) {
                    System.out.println(this.getName() + "-> locked resource 1 ");

                }
                Thread.sleep(10);
                synchronized (resource2) {
                    System.out.println(this.getName() + "-> locked resource 2 ");
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(this.getName() + " is waiting....  ");

        }
    }

    public static void main(String[] args) {
        Deadlocks deadlocks_1 = new Deadlocks("Thread 1");
        Deadlocks2 deadlocks_2 = new Deadlocks2("Thread 2");

        deadlocks_1.start();
        deadlocks_2.start();
    }
}
