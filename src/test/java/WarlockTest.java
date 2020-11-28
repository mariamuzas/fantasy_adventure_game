import org.junit.Before;
import org.junit.Test;
import players.enums.Creatures;
import players.enums.Spells;
import players.magicians.Warlock;
import players.magicians.Wizard;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void setup(){
        warlock = new Warlock("Maria", 20, Spells.LIGHTSTAR, Creatures.OGRE, true);
    }

    @Test
    public void hasName() {
        assertEquals("Maria", warlock.getName());
    }

    @Test
    public void hasSpell() {
        assertEquals(Spells.LIGHTSTAR, warlock.getSpellType());
    }

    @Test
    public void hasABook(){
        assertEquals(true, warlock.hasBook());
    }
    
    @Test
    public void canChangeWeapon(){
        warlock.changeSpell(Spells.FIREBALL);
        assertEquals(Spells.FIREBALL, warlock.getSpellType());
    }
    @Test
    public void hasCreature() {
        assertEquals(Creatures.OGRE, warlock.getMythicalCreature());
    }
    @Test
    public void canChangeCreature() {
        warlock.changeCreature(Creatures.DRAGON);
        assertEquals(Creatures.DRAGON, warlock.getMythicalCreature());
    }
}
