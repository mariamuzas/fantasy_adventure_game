package players.magicians;

import players.enums.Creatures;
import players.enums.Spells;

public class Wizard extends Magician {
    
    private boolean wand;

    public Wizard(String name, int healthPoints, Spells spellType, Creatures creature, boolean wand) {
        super(name, healthPoints, spellType, creature);
        this.wand = wand;
    }

    public boolean hasWand() {
        return wand;
    }
}
