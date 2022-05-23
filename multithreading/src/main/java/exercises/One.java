package exercises;

public class One extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("No, " + i);
        }

    }

    public static void main(String[] args) {
        One one = new One();
        one.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main:" + i);
        }
    }
}
