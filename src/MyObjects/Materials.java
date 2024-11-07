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

    private final double endurance_coficent;

    Materials(double coficent) {
        this.endurance_coficent = coficent;
    }

    public double getEnduranceCoficent() {
        return endurance_coficent;
    }
}
