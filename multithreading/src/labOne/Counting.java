package labOne;

public class Counting extends Thread {
    private int count = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
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
        Counting c2 = new Counting();
        c1.start();
        c2.start();
        try {

            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c1.getCount());
        System.out.println(c2.getCount());
    }
}
