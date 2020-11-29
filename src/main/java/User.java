import players.Cleric;
import players.IFight;
import players.Player;
import java.util.ArrayList;

public class User {

    private ArrayList<Player> players;
    private ArrayList<Treasures> treasuresCollected;
    private ArrayList<Enemies> enemiesDefeated;
    ArrayList<IFight> playerFighters = new ArrayList<>();

    public User() {
        this.players = new ArrayList<>();
        this.treasuresCollected = new ArrayList<>();
        this.enemiesDefeated = new ArrayList<>();
    }

    public int treasuresCount() {
        return this.treasuresCollected.size();
    }

    public int enemiesDefeated() {
        return this.enemiesDefeated.size();
    }

    public void collectTreasure(Room room) {
        if (room.getTreasure().getValue() > 0) {
            this.treasuresCollected.add(room.getTreasure());
        }
    }

    public int countOfPlayer(){
        return this.players.size();
    }
    public int countFighters(){
        return this.playerFighters.size();
    }


    public void addPlayerToArmy(Player player){
        this.players.add(player);
    }

    public void fight(Room room) {
        if (room.getEnemy().getDamage() > 0) {
        for (Player player : players) {
            if (player.isCanFight()) {
                playerFighters.add((IFight) player);
            }
        }
    }
        for (IFight player2 : playerFighters) {
            Enemies enemyFighting = room.getEnemy();
            if (player2.getTotals() >= enemyFighting.getDamage() && enemyFighting.getDamage() > 0) {
                enemiesDefeated.add(enemyFighting);
                room.enemyDead(enemyFighting);
            }
        }
    }

    public void healPlayers(Cleric cleric) {
        for( IFight playerHurt : playerFighters){
            if( playerHurt.getTotals() > 5) {
                cleric.heal((Player) playerHurt);
            }
        }
    }
}
