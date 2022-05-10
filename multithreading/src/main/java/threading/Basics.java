package threading;

public class Basics extends Thread {

    @Override
    public void run() {
        System.out.println("Running....");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Basics basics = new Basics();
        basics.start();

    }
}
