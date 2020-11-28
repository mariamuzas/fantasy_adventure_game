package players.magicians;

import players.IFight;
import players.Player;
import players.enums.Creatures;
import players.enums.Spells;

public abstract class Magician extends Player implements IFight {
    private Spells spellType;
    private Creatures creature;
    private int totalPoints;
    private boolean canFight;

    public Magician(String name, int healthPoints, Spells spellType, Creatures creature) {
        super(name, healthPoints);
        this.spellType = spellType;
        this.creature = creature;
        this.totalPoints = totalPoints;
        this.canFight = true;

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

    public int getTotals() {
        this.totalPoints = getHealthPoints() + spellType.getValue() + creature.getValue();
        return this.totalPoints;
    }

    public boolean isCanFight(){
        return this.canFight;
    }
}
