package MyObjects;

import java.util.Objects;

public class Boots extends Equipment{

    static int counter = 0;
    final int id;

    public Boots(Materials mainMaterial, double baseStepAttrition) {
        super(mainMaterial, baseStepAttrition);
        id = counter++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wearPercent, material, stepAttrition);
    }

    @Override
    public String toString() {
        return "Boots{" +
                "id='" + id + '\'' +
                ", wearPercent='" + wearPercent + '\'' +
                ", material='" + material + '\'' +
                ", stepAttrition='" + stepAttrition + '\''+
                '}';
    }

    public int getId() {
        return id;
    }

}
