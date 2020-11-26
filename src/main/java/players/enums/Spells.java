package players.enums;

public enum Spells {
    FIREBALL(20),
    LIGHTSTAR(10);

    private int value;

    Spells(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
