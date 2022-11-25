package factory;

import java.util.Locale;

public class WeaponFactory {

    public static WeaponFactory produce(String weapon) {
        if (weapon != null) {

            switch (weapon.toLowerCase(Locale.ROOT)) {
                case "pistol":
                    return new PistolFactory();
                case "ak4":
                    return new AkFactory();
            }
        }
        return null;
    }


}
