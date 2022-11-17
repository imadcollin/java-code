package mediator;

public class Lamp {
    private Button button;
    private Power power;

    public Lamp(Button button, Power power) {
        this.power = power;
        this.button = button;
    }

    public void turnOn() {
        if (power.isConnected())
            button.pressUP();
        System.out.println("Turn On...");

    }

    public void turnOff() {
        button.pressDown();
        System.out.println("Turn Off...");

    }

}
