package MyObjects;

import java.util.ArrayList;

public interface MainCharacter {

    default double getLevelOfBeauty() {return 0;}

    default ArrayList<Items> getEquipments() {return new ArrayList<Items>();}

    void addEquipment(Equipment equipment);

    void removeEquipment(Equipment equipment);

    void setEquipment(ArrayList<Items> equipments);

    void cry(CoveredObjects onWhatObject);
}
