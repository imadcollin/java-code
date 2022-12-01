package adapter;

public class SamsungCharger implements AndroidCharger {
    @Override
    public void charge() {
        System.out.println("Samsung Charger");
    }
}
