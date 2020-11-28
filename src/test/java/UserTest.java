import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Player;
import players.enums.Creatures;
import players.enums.HealingTools;
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
    Player cleric1;

    @Before
    public void before() {
        room = new Room(Treasures.NONE, Enemies.ORC);
        room1 = new Room(Treasures.GEMS, Enemies.NONE);
        user = new User();
        barbarian = new Barbarian("Phil", 10, Weapons.AXE, true);
        warlock = new Warlock("Maria", 20, Spells.LIGHTSTAR, Creatures.OGRE, true);
        cleric1 = new Cleric("Bob", 10, HealingTools.POTION);

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
    @Test
    public void noEnemiesDefeated() {
        assertEquals(0, user.enemiesDefeated());
    }
    @Test
    public void noPlayers(){
        assertEquals(0, user.countOfPlayer());
    }
    @Test
    public void canAddPlayer() {
        user.addPlayerToArmy(warlock);
        assertEquals(1, user.countOfPlayer());
    }

    @Test
    public void canFightEnemy() {
        user.addPlayerToArmy(warlock);
        user.fight(room);
        assertEquals(1, user.countFighters());
        assertEquals(1, user.enemiesDefeated());
    }
    @Test
    public void canFightEnemy2() {
        user.addPlayerToArmy(warlock);
        user.addPlayerToArmy(cleric1);
        user.addPlayerToArmy(barbarian);
        user.fight(room);
        assertEquals(2, user.countFighters());
        assertEquals(1, user.enemiesDefeated());
    }
}
