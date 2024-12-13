package MyObjects;

public interface CoveredObjects {

    default public Materials getCoveringMaterial() { return null; }

    default public void setCoveringMaterial(Materials coveringMaterial) { }

}
