package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observerList = new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void add(Observer observe) {
        observerList.add(observe);

    }

    public void notifyAllObservers() {
        for (Observer observer : observerList
        ) {
            observer.update();
        }
    }
}
