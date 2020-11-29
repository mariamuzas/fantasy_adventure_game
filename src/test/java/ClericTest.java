import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.enums.HealingTools;
import players.enums.Weapons;
import players.warriors.Dwarves;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric1;
    Dwarves dwarf1;

    @Before
    public void setup(){
        cleric1 = new Cleric("Bob", 10, HealingTools.POTION);
        dwarf1 = new Dwarves("Pete", 5, Weapons.CLUB, 1.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", cleric1.getName());
    }

    @Test
    public void hasHealingTool() {
        assertEquals(HealingTools.POTION, cleric1.getHealingTool());
    }

    @Test
    public void canChangeHealingTool(){
        cleric1.changeHealingTool(HealingTools.HERBS);
        assertEquals(HealingTools.HERBS, cleric1.getHealingTool());

    }

    @Test
    public void canHeal(){
        cleric1.heal(dwarf1);
        assertEquals(10, dwarf1.getHealthPoints());
    }

}
