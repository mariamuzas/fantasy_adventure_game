package players.warriors;

import players.IFight;
import players.enums.Weapons;

import players.Player;

public abstract class Warrior extends Player  implements IFight {
    private Weapons weaponType;
    private int totalPoints;
    private boolean canFight;

    public Warrior(String name, int healthPoints, Weapons weaponType) {
        super(name,  healthPoints);
        this.weaponType = weaponType;
        this.totalPoints = totalPoints;
        this.canFight = true;
    }

    public Weapons getWeaponType() {
        return this.weaponType;
    }

    public void changeWeapon(Weapons weaponType) {
        this.weaponType = weaponType;
    }

    public int getTotals() {
        this.totalPoints = getHealthPoints() + weaponType.getValue();
        return this.totalPoints;
    }
}
