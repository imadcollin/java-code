package exercises;

import java.util.stream.IntStream;

public class Fifth {
    public static class Add extends Thread {
        public void run() {
            add();
        }

        public void add() {
            IntStream intStream = IntStream.range(0, 50);
            System.out.println(intStream.sum());
        }
    }

    public static class Sub extends Thread {
        public void run() {
            sub();
        }

        public void sub() {
            IntStream intStream = IntStream.range(0, 50);
            System.out.println((-1) * intStream.reduce(0, Integer::sum));
        }
    }

    public static void main(String[] args) {
        Add add = new Add();
        Sub sub = new Sub();
        add.start();
        sub.start();

    }
}
