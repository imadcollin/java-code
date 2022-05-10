package threading;

public class MainRunnable {
    public static void main(String[] args) {

        MyRunnable myRunable = new MyRunnable();
        Thread t1 = new Thread(myRunable);
        t1.start();
    }
}
