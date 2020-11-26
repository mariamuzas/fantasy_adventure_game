public enum Enemies {
    NONE(0),
    ORC(10),
    TROLL(5);
    
    private int damage;

    Enemies(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
