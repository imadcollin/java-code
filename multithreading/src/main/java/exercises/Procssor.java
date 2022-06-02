package exercises;

public class Procssor extends Thread {
    private volatile boolean working = true;

    @java.lang.Override
    public void run() {

        while (working) {

            System.out.println("working...");
            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void stopWorking() {
        working = false;
    }

    public static void main(String[] args) {
        Procssor p = new Procssor();
        p.start();
        System.out.println("Try to stop the thread...");
        for (int i = 0; i < 25; i++) {
            System.out.println(i);
            if (i == 10)
                p.stopWorking();
        }

    }
}
