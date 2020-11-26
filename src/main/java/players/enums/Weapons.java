package players.enums;

public enum Weapons {
    AXE(10),
    SWORD(15),
    CLUB(5);
    
    private int value;

    Weapons(int value) {
        this.value = value;
    }

    public  int getValue() {
        return value;
    }
}