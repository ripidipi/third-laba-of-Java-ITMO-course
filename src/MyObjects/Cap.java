package MyObjects;

import java.util.Objects;

public class Cap extends Equipment {

    static int counter = 0;
    final int id;

    public Cap(Materials mainMaterial, double baseStepAttrition) {
        super(mainMaterial, baseStepAttrition);
        id = counter++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wearPercent, material, stepAttrition);
    }

    @Override
    public String toString() {
        return "Cap{" +
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
