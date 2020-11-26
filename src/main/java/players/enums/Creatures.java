package players.enums;

public enum Creatures {
    OGRE(10),
    DRAGON(15);

    private int value;

    Creatures(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
