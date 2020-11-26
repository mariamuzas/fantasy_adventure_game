public class Room {
    private Treasures treasure;
    private Enemies enemy;

    public Room(Treasures treasure, Enemies enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
    }

    public Treasures getTreasure() {
        return this.treasure;
    }

    public Enemies getEnemy() {
        return this.enemy;
    }
}
