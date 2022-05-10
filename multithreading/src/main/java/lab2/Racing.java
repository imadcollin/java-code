package lab2;

public class Racing implements Runnable {
    private int num = 0;

    private void incr() {
        num++;
    }

    private void decr() {
        num--;
    }

    private int getValue() {
        return num;
    }


    @Override
    public void run() {
        try {

            System.out.printf("\n Name %s -> Value %d", Thread.currentThread().getName(), getValue());
            Thread.sleep(100);
            incr();
            System.out.printf("\n Name %s -> Value %d", Thread.currentThread().getName(), getValue());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        decr();
    }

    public static void main(String[] args) {
        Racing c = new Racing();
        Thread t1 = new Thread(c, "Thread 1 -> ");
        Thread t2 = new Thread(c, "Thread 2 -> ");
        t1.start();
        t2.start();
    }
}
