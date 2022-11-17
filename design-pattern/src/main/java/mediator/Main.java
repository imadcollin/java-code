package mediator;

public class Main {
    public static void main(String[] args) {
        Power power = new Power();
        power.plug();

        Button button = new Button();

        Lamp lamp = new Lamp(button, power);

        lamp.turnOn();
        lamp.turnOff();
    }
}
