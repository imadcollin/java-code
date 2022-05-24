package exercises;

public class Third extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
        }

    }

    public static void main(String[] args) {
        Third third = new Third();
        third.start();
        third.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main: " + i);
        }
    }

}
