package players.warriors;

import players.enums.Weapons;

public class Barbarian extends Warrior {
    private boolean beard;

    public Barbarian(String name, int healthPoints, Weapons weaponType, boolean beard) {
        super(name, healthPoints, weaponType);
        this.beard = beard;
    }

    public boolean hasBeard() {
        return this.beard;
    }
}
