package threading.suspend;

public class Suspending extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("i->" + i);

        }
    }

    public static void main(String[] args) {
        Suspending s1 = new Suspending();
        Suspending s2 = new Suspending();
        Suspending s3 = new Suspending();

        s1.start();
        s1.suspend();
        s2.start();
        s3.start();


    }
}
