package players.warriors;

import players.enums.Weapons;

import players.Player;

public abstract class Warrior extends Player {
    private Weapons weaponType;

    public Warrior(String name, int healthPoints, Weapons weaponType) {
        super(name, healthPoints);
        this.weaponType = weaponType;
    }

    public Weapons getWeaponType() {
        return this.weaponType;
    }
    
//    public void changeWeapon() {}
}
