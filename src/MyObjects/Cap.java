package MyObjects;

import java.util.Objects;

public class Cap extends Equipment {

    static int counter = 0;
    final int id;

    Cap(Materials mainMaterial, double baseStepAttrition) {
        super(mainMaterial, baseStepAttrition);
        id = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Cap cap = (Cap) o;
        return  id == cap.id &&
                material == cap.material &&
                wearPercent == cap.wearPercent &&
                stepAttrition == cap.stepAttrition;
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
