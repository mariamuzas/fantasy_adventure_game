import org.junit.Before;
import org.junit.Test;
import players.enums.Creatures;
import players.enums.Spells;
import players.enums.Weapons;
import players.magicians.Wizard;
import players.warriors.Barbarian;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setup(){
        wizard = new Wizard("Yana", 30, Spells.FIREBALL, Creatures.DRAGON, true);
    }

    @Test
    public void hasName() {
        assertEquals("Yana", wizard.getName());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spells.FIREBALL, wizard.getSpellType());
    }
    
    @Test
    public void hasAWand(){
        assertTrue(wizard.hasWand());
    }
    
    @Test
    public void canChangeWeapon(){
        wizard.changeSpell(Spells.LIGHTSTAR);
        assertEquals(Spells.LIGHTSTAR, wizard.getSpellType());
    }
    @Test
    public void hasCreature() {
        assertEquals(Creatures.DRAGON, wizard.getMythicalCreature());
    }
    @Test 
    public void canChangeCreature() {
        wizard.changeCreature(Creatures.OGRE);
        assertEquals(Creatures.OGRE, wizard.getMythicalCreature());
    }
}
