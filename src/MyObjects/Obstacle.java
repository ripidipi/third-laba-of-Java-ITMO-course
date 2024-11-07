package MyObjects;

public enum Obstacle {

    FOREST,
    MOUNTAINS,
    FIELD,
    SWAMP,
    DESERT,
    TOWN;

    @Override
    public String toString() {
        return "Went to " + super.toString().toLowerCase();
    }
}
