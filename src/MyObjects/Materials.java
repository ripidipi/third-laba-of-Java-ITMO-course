package MyObjects;

public enum Materials {

    NOTHING(1),
    WOOD(0.8),
    LATHER(0.7),
    IRON(0.4),
    PLASTIC(0.6),
    GOLD(0.9),
    COTTON(0.8),
    DIAMOND(0.3);

    private final double endurance_coefficient;

    Materials(double coefficient) {
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
