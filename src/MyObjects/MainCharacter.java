package MyObjects;

import java.util.ArrayList;

public interface MainCharacter {

    public default double getLevelOfBeauty() {return 0;}

    public default ArrayList<Items> getEquipments() {return new ArrayList<Items>();}

    public void addEquipment(Equipment equipment);

    public void removeEquipment(Equipment equipment);

    public void setEquipment(ArrayList<Items> equipments);

    public void cry(CoveredObjects onWhatObject);
}
