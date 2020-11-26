package players;

import players.enums.HealingTools;

import players.Player;

public class Cleric extends Player {
    private HealingTools healingTool;
    private boolean canFight;

    public Cleric(String name, int healthPoints, HealingTools healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;
        this.canFight = false;
    }

    public HealingTools getHealingTool() {
        return this.healingTool;
    }

    public void changeHealingTool(HealingTools healingTool) {
        this.healingTool = healingTool;
    }

    public void heal(Player player) {
        int totalpoints = player.getHealthPoints() + 10;
        player.setHealthPoints(totalpoints);
    }
}
