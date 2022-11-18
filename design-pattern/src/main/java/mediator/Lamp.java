package mediator;

public class Lamp {
    private Button button;
    private Power power;

    public Lamp(Button button, Power power) {
        this.power = power;
        this.button = button;
    }

    public Lamp() {

    }

    public void turnOn() {
        if (power.isConnected() && button.isButtonON())
            System.out.println("Turn On...");
        else
            System.out.println("You shoukd connect and press button on...");

    }

    public void turnOff() {
        if (!button.isButtonON())
            System.out.println("Turn Off...");
        else
            System.out.println("You need to Press the button down...");


    }

}
