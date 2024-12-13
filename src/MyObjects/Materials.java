package MyObjects;

public enum Materials {

    NOTHING(1),
    WOOD(0.8),
    LATHER(0.7),
    GLASS(0.4),
    IRON(0.4),
    PLASTIC(0.6),
    STONE(0.5),
    GOLD(0.9),
    COTTON(0.8),
    DIAMOND(0.3),
    BLOOD(100),
    WATER(100),;

    private final double enduranceCoefficient;

    Materials(double coefficient) {
        this.enduranceCoefficient = coefficient;
    }

    public double getEnduranceCoefficient() {
        return enduranceCoefficient;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
