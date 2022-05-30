package exercises;

public class B implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {

                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /* public static void main(String[] args) {
         Thread t1 = new Thread(new B());
         Thread t2 = new Thread(new B());
         t1.start();
         t2.start();
     }
 */
    public static void main(String[] args) {
        Thread t1 = new Thread(new B());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new B());
        t1.start();

        try {
            t1.join();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        t2.start();
    }
}
