package mediator;

public class Medaitor {
    private Button button;
    private Power power;
    private Lamp lamp;

    public Medaitor() {
        button = new Button();
        power = new Power();
        lamp = new Lamp();
    }

    public void connect() {
        power.plug();
    }

    public void unplug() {
        power.unplug();
    }

    public void press() {
        if (button.isButtonON())
            button.pressDown();
        else
            button.pressUP();

    }

    public void turOn() {
        if (button.isButtonON() && power.isConnected())
            System.out.println("Turning on");
        else
            System.out.println("Turning Off..");
    }
}
