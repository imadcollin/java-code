package factory;

public class Ak1 extends Weapon{
    @Override
    public void details() {
        System.out.println("Ak1 created");
    }

    @Override
    public boolean requireLicense() {
        return true;
    }
}
