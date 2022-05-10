package labOne;

public class Counting extends Thread {
    private int count = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            increment();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }

    private void increment() {
        count++;
    }

    private int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counting c1 = new Counting();
        c1.increment();
        c1.increment();

        System.out.printf("Sequentially: %d", c1.getCount());

        System.out.println("\n----------------");
        Counting counting = new Counting();
        Thread t1 = new Thread(counting);
        Thread t2 = new Thread(counting);
        t1.start();
        t2.start();
        try {

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Concurrent: %d", counting.getCount());

    }
}
