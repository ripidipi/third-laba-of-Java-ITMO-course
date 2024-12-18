package MyObjects;

public interface CoveredObjects {

    default Materials getCoveringMaterial() { return null; }

    default void setCoveringMaterial(Materials coveringMaterial) { }

}
