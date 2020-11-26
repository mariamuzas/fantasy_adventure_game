import org.junit.Before;
import org.junit.Test;
import players.enums.Weapons;
import players.warriors.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;

    @Before
    public void setup(){
    barbarian1 = new Barbarian("Phil", 10, Weapons.AXE, true);
    }

    @Test
    public void hasName() {
    assertEquals("Phil", barbarian1.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(Weapons.AXE, barbarian1.getWeaponType());
    }
    
    @Test
    public void canChangeWeapon(){
        barbarian1.changeWeapon(Weapons.CLUB);
        assertEquals(Weapons.CLUB, barbarian1.getWeaponType());

    }

}


