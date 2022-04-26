package multiThreading.deadlock;

public class Dead implements Runnable {
    private Object obj1;
    private Object obj2;

    public Dead(Object o1, Object o2) {
        this.obj1 = o1;
        this.obj2 = o2;
    }

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
        synchronized (obj1) {
            System.out.println("-> Lock on" + obj1);
            doWork();
            synchronized (obj2) {
                System.out.println("-> Lock on" + obj2);
                doWork();
            }
            System.out.println("Lock is released....");
        }
    }

    private void doWork() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
