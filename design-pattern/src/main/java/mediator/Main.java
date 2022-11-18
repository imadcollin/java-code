package mediator;

public class Main {
    public static void main(String[] args) {
        Power power = new Power();
        power.plug();

        Button button = new Button();
        button.pressUP();
        Lamp lamp = new Lamp(button, power);

        lamp.turnOn();
        lamp.turnOff();

        System.out.println("************");

        Medaitor medaitor = new Medaitor();
        medaitor.connect();
        medaitor.press();
        medaitor.turOn();
        ;
    }
}
