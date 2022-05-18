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

    public static void main(String[] args) {
        Philosophers[] philosophersList = new Philosophers[5];
        Object[] objs = new Object[5];
        for (int i = 0; i < objs.length; i++) {
            objs[i] = new Object();
        }
        for (int i = 0; i < philosophersList.length; i++) {
            System.out.println("test...");
            Object left = objs[i];
            Object right = objs[(i + 1) % objs.length];
            if (i == philosophersList.length - 1)
                philosophersList[i] = new Philosophers(right, left);
            else
                philosophersList[i] = new Philosophers(left, right);

            Thread t = new Thread(philosophersList[i], "PHilosopher " + (i + 1));
            t.start();
        }
    }

}
