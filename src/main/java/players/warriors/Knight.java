package players.warriors;

import players.enums.Weapons;

public class Knight extends Warrior{
    private boolean armour;

    public Knight(String name, int healthPoints, Weapons weaponType, boolean armour) {
        super(name, healthPoints, weaponType);
        this.armour = armour;
    }

    public boolean hasArmour() {
        return armour;
    }
}
