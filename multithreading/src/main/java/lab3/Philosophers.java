package lab3;

public class Philosophers implements Runnable {

    private Object left;
    private Object right;

    public Philosophers(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        try {
            while (true) {
                doAction("thinking....");
                synchronized (left) {
                    doAction("taking left");
                    synchronized (right) {
                        doAction("taking right");
                        doAction("done with  right");
                    }
                    doAction("done with left");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doAction(String task) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + task);
        Thread.sleep(100);
    }

}
