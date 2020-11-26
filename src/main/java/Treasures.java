public enum Treasures {
    NONE(0),
    GOLD(10),
    GEMS(15);
    
    private int value;

    Treasures(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
