package threading.sleeping;

public class ThreadSleeping extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
        super.run();
    }

    public static void main(String[] args) {
        ThreadSleeping t1 = new ThreadSleeping();
        ThreadSleeping t2 = new ThreadSleeping();

        t1.start();
        t2.start();
    }

}
