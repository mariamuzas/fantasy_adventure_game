package players;

import players.enums.HealingTools;

import players.Player;

public class Cleric extends Player {
    private HealingTools healingTool;
        
    public Cleric (String name, int healthPoints, HealingTools healingTool) {
        super(name,  healthPoints);
        this.healingTool = healingTool;
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
