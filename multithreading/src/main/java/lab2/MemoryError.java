package lab2;

public class MemoryError {
    private static boolean msg = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!msg) {

            }
            System.out.println("hello...!");

            while (msg) {

            }
            System.out.println("bye...!");
        });
        thread.start();
        Thread.sleep(100);
        msg = false;
        System.out.println("msg good");
        Thread.sleep(100);
        System.out.println("msg bye");
        msg = false;
    }
}
