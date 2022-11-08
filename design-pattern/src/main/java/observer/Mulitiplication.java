package observer;

public class Mulitiplication extends Observer{

    public Mulitiplication(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Multi -> %d * %d = %d", subject.getState(), subject.getState(), subject.getState() * 2));
    }
}
