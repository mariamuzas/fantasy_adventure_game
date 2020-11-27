import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.enums.Creatures;
import players.enums.Spells;
import players.enums.Weapons;
import players.magicians.Warlock;
import players.warriors.Barbarian;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;
    Room room;
    Room room1;
    Player barbarian;
    Player warlock;

    @Before
    public void before() {
        room = new Room(Treasures.NONE, Enemies.ORC);
        room1 = new Room(Treasures.GEMS, Enemies.NONE);
        user = new User();
        barbarian = new Barbarian("Phil", 10, Weapons.AXE, true);
        warlock = new Warlock("Maria", 20, Spells.LIGHTSTAR, Creatures.OGRE, true);
    }

    @Test
    public void noTreasuresCollected(){
        assertEquals(0, user.treasuresCount());
    }
    @Test
    public void canCollectTreasure() {
        user.collectTreasure(room1);
        assertEquals(1, user.treasuresCount());
    }



}
