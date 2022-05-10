package threading.joinning;

public class Joinning extends Thread {
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
    }

    public static void main(String[] args) {
        Joinning j1 = new Joinning();
        Joinning j2 = new Joinning();
        Joinning j3 = new Joinning();

        j1.start();
        try {
            j1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        j2.start();
        j3.start();
    }
}
