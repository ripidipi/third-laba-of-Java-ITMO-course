package MyObjects;

import java.util.ArrayList;

public interface MainCharacter {

    public default double getLevelOfBeauty() {return 0;}

    public default ArrayList<Items> getEquipments() {return new ArrayList<Items>();}

    public default void addEquipment(Equipment equipment) {}

    public default void removeEquipment(Equipment equipment) {}

    public default void setEquipment(ArrayList<Items> equipments) {}

    public default void cry(CoveredObjects onWhatObject) {}
}
