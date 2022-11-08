package observer;

public class Addition extends Observer {

    public Addition(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Addition -> %d + %d = %d", subject.getState(), subject.getState(), subject.getState() * 2));
    }
}
