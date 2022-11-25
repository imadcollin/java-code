package factory;

public class AutomaticPistol extends Weapon{
    @Override
    public void details() {
        System.out.println("Automatic Pistol ... ");
    }

    @Override
    public boolean requireLicense() {
        return true;
    }
}
