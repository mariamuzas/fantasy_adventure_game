import players.IFight;
import players.Player;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    Room room;

    private ArrayList<Player> players;
    private ArrayList<Treasures> treasuresCollected;
    private ArrayList<Enemies> enemiesDefeated;

    public User() {
        this.players = new ArrayList<>();
        this.treasuresCollected = new ArrayList<>();
        this.enemiesDefeated = new ArrayList<>();
    }

    public int treasuresCount() {
        return this.treasuresCollected.size();
    }

    public int enemiesDefeated() {
        return this.enemiesDefeated();
    }

    public void collectTreasure(Room room) {
        if (room.getTreasure().getValue() > 0) {
            this.treasuresCollected.add(room.getTreasure());
        }
    }

    public String fight() {
        ArrayList<IFight> playerFighters = new ArrayList<>();
        String resultOfFight = null;

        if (room.getEnemy().getDamage() > 0) {
            for (Player player : players) {
                if (player.isCanFight()) {
                    playerFighters.add((IFight) player);
                }
            }
        }
        for (IFight player : playerFighters) {
            if (player.getTotals() > room.getEnemy().getDamage()) {
                resultOfFight = "Win!";
            } else {
                resultOfFight = "You lose";
            }
        }
        return resultOfFight;
    }
}
