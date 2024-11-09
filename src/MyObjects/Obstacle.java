package MyObjects;

public enum Obstacle {

    FOREST(1.5),
    MOUNTAINS(2),
    FIELD(1),
    SWAMP(1.8),
    DESERT(1.2),
    TOWN(0.2);

    private final double endurance_coefficient;

    Obstacle(double coefficient) {
        this.endurance_coefficient = coefficient;
    }

    public double getEnduranceCoefficient() {
        return endurance_coefficient;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
