package multiThreading.timerTask;

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        TimerEx timerEx = new TimerEx();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerEx, 0, 100000);
        System.out.println("Timer started");
        try {
            Thread.sleep(150000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        timer.cancel();

    }

}
