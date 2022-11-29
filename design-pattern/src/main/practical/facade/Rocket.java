package facade;

public class Rocket {
    public Rocket(String name, double range) {
        this.name = name;
        this.range = range;
    }

    private String name;
    private double range;

    private boolean isPressureCheck() {
        return true;
    }

    private boolean isReady() {
        return true;
    }

    public void fly() {
        System.out.println("The Rocket starting to fly....");
    }

    public void rocketStop() {

        System.out.println("The Rocket is stopped.... ");
    }

    public boolean rocketStatus() {
        if (isReady() && isPressureCheck()) {
            System.out.println("Everything IS working.... ");
            return true;
        } else {
            System.out.println("Something worng with the Rocket....");
            return false;
        }
    }
}
