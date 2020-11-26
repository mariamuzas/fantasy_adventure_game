package players.magicians;

import players.enums.Creatures;
import players.enums.Spells;

public class Warlock extends Magician {
    private boolean book;

    public Warlock(String name, int healthPoints, Spells spellType, Creatures creature, boolean book) {
        super(name, healthPoints, spellType, creature);
        this.book = book;
    }

    public boolean hasBook() {
        return book;
    }
}
