package players;

public abstract class Player {
    private String name;
    private int healthPoints;
    private boolean canFight;

    public Player( String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.canFight = canFight;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public boolean isCanFight() {
        return this.canFight;
    }
}
