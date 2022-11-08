package observer;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new Addition(subject);
        new Mulitiplication(subject);

        subject.setState(2);
        subject.notifyAllObservers();

        subject.setState(4);
        subject.notifyAllObservers();


    }
}
