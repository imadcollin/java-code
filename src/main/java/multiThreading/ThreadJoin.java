package multiThreading;

public class ThreadJoin {

    public static void main(String[] args) {
        Thread t1 = new Thread(new JavaThreads(), "t1");
        Thread t2 = new Thread(new JavaThreads(), "t2");

        t1.start();

        try {
            t1.join(2000);

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    t2.start();
         try {
            t2.join(2000);

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

}
