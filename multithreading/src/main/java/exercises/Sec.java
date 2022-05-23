package exercises;

public class Sec extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Run:" + i);
        }
    }

    public static void main(String[] args) {
        Sec sec = new Sec();
        sec.run();

        for (int i = 0; i < 50; i++) {
            System.out.println("Main:" + i);
        }
    }
}
