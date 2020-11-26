package players.enums;

public enum HealingTools {
    POTION(10),
    HERBS(15);

    private int value;

    HealingTools(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
