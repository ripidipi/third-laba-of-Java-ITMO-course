package MyObjects;

public enum Characters {

    NOBODY,
    BEASTS,
    WIZARD,
    WITCH,
    DRUNK,
    SPIRIT,
    BANDITS;

    @Override
    public String toString() {
        return "Meet " + super.toString().toLowerCase();
    }

}

