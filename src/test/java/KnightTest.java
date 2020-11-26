import org.junit.Before;
import org.junit.Test;
import players.enums.Weapons;
import players.warriors.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight1;

    @Before
    public void setup(){
        knight1 = new Knight("Sam", 10, Weapons.SWORD, true);
    }

    @Test
    public void hasName() {
        assertEquals("Sam", knight1.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapons.SWORD, knight1.getWeaponType());
    }

    @Test
    public void canChangeWeapon(){
        knight1.changeWeapon(Weapons.CLUB);
        assertEquals(Weapons.CLUB, knight1.getWeaponType());
    }
}
