package factory;

import java.util.Locale;

public class PistolFactory extends WeaponFactory{
    public PistolFactory(){}
    public  Weapon createPistol(String pistolType){
        if (pistolType !=null && pistolType.length()>0){
            switch (pistolType.toLowerCase(Locale.ROOT)){
                case "manual":
                    return new ManualPistol();
                case "automatic":
                    return new AutomaticPistol();
            }
            return null;
        }
        return null;
    }
}
