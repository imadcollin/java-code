package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WeaponFactoryTest {

    @Test
    public void init() {

    }

    @Test
    public void testWeaponIsPistol() {
        assertEquals(PistolFactory.class, WeaponFactory.produce("pistol").getClass());
        PistolFactory pistolFactory = (PistolFactory) WeaponFactory.produce("pistol");
        assertEquals(pistolFactory.createPistol("manual").getClass(), ManualPistol.class);
        assertEquals(pistolFactory.createPistol("manual").getClass(), ManualPistol.class);

    }

    @Test
    public void testWeaponIsPistolAutomatic() {
        PistolFactory pistolFactory = (PistolFactory) WeaponFactory.produce("pistol");
        assertTrue(pistolFactory.createPistol("Automatic") instanceof AutomaticPistol);
        assertEquals(pistolFactory.createPistol("Automatic").getClass(), AutomaticPistol.class);
        assertTrue(pistolFactory.createPistol("Automtic").requireLicense());
    }

}