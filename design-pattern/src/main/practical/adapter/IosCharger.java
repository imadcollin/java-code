package adapter;

public class IosCharger implements AppleCharger{
    @Override
    public void charge() {
        System.out.println("Ios Cjarger");
    }
}
