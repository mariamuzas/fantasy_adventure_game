package players.magicians;

import players.Player;
import players.enums.Creatures;
import players.enums.Spells;

public abstract class Magician extends Player {
    private Spells spellType;
    private Creatures creature;

    public Magician(String name, int healthPoints, Spells spellType, Creatures creature) {
        super(name, healthPoints);
        this.spellType = spellType;
        this.creature = creature;
    }
    
    public Spells getSpellType() {
        return this.spellType;
    }

    public Creatures getMythicalCreature() {
        return this.creature;
    }

    public void changeSpell(Spells spellType) {
        this.spellType = spellType;
    }

    public void changeCreature(Creatures mythicalCreature) {
        this.creature = mythicalCreature;
    }
}
