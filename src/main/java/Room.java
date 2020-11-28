import java.util.ArrayList;

public class Room {

    private Treasures treasure;
    private ArrayList<Enemies> enemies;

    public Room(Treasures treasure) {
        this.treasure = treasure;
        this.enemies = new ArrayList<>();
    }

    public Treasures getTreasure() {
        return this.treasure;
    }

    public void addEnemyToTheRoom(Enemies enemy){
        this.enemies.add( enemy);
    }

    public int enemyCount() {
        return this.enemies.size();
    }

    public Enemies getEnemy() {
        if(enemyCount() >= 1) {
           return this.enemies.get(0);
        }
        return Enemies.NONE;
    }

    public void enemyDead(Enemies enemy) {
        this.enemies.remove(enemy);
    }
}
