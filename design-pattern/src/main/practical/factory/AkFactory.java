package factory;

import java.util.Locale;

public class AkFactory extends WeaponFactory {
    public static Weapon createAk(String akTpe){
        if(akTpe !=null && akTpe.length()>0){
            switch (akTpe.toLowerCase(Locale.ROOT)){
                case "Ak1":
                    return new Ak1();
                default:
                    System.out.println("Not available ...");
            }
        }
        return null;
    }
}
