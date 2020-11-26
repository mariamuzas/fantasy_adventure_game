package players.warriors;

import players.enums.Weapons;

public class Dwarves extends Warrior {

    private double height;

    public Dwarves(String name, int healthPoints, Weapons weaponType, double height) {
        super(name, healthPoints, weaponType);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
