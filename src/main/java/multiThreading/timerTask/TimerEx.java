package multiThreading.timerTask;

import java.util.TimerTask;

public class TimerEx extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer is started...." + System.currentTimeMillis());
        try {
        Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Timer is Ended...." + System.currentTimeMillis());
    }
}
