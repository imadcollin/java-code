package factory;

public class ManualPistol extends Weapon{

    @Override
    public void details() {
        System.out.println("Maulal Pistol.... ");
    }

    @Override
    public boolean requireLicense() {
        return true;
    }
}
