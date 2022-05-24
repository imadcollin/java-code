package exercises;

public class Fourth extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {

            System.out.printf("%s is running: %d \n", Thread.currentThread().getName(), i);
        }
    }

    public static void main(String[] args) {
        Fourth f1 = new Fourth();
        Fourth f2 = new Fourth();
        Fourth f3 = new Fourth();

        f1.start();
        f2.start();
        f3.start();

        for (int i = 0; i < 50; i++) {

            System.out.printf(" Main is running: %d", i);

        }
    }
}
