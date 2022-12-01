package adapter;

public class NokiaCharger implements AndroidCharger {
    @Override
    public void charge() {
        System.out.println("Nokia Charger");
    }
}
