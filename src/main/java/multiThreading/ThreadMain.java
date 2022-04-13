package multiThreading;

public class ThreadMain {

    public static void main(String[] args) {
        Thread th1 = new Thread(new JavaThreads(), "th1");
        Thread th2 = new Thread(new JavaThreads(), "th2");

        System.out.println("Starting Runnables ... ");
        th1.start();
        th2.start();

        MyThread myThread1 = new MyThread("myThrea1");
        MyThread myThread2 = new MyThread("myThrea2");

        System.out.println("Starting MyOwnThreads ... ");
        myThread1.start();
        myThread2.start();


    }
}
