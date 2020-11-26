import org.junit.Before;
import org.junit.Test;
import players.enums.Weapons;
import players.warriors.Dwarves;
import players.warriors.Knight;

import static org.junit.Assert.assertEquals;

public class DwarvesTest {


    Dwarves dwarf1;

    @Before
    public void setup(){
        dwarf1 = new Dwarves("Pete", 20, Weapons.CLUB, 1.00);
    }

    @Test
    public void hasName() {
        assertEquals("Pete", dwarf1.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapons.CLUB, dwarf1.getWeaponType());
    }

    @Test
    public void canChangeWeapon(){
        dwarf1.changeWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, dwarf1.getWeaponType());
    }
}
