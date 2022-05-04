package threading.priority;

public class Priportiy extends Thread {
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
        Priportiy p1 = new Priportiy();
        Priportiy p2 = new Priportiy();

        System.out.printf("p1 priority: %d - p2 priority %d \n", p1.getPriority(), p2.getPriority());
        p1.start();
        p2.start();
    }
}
