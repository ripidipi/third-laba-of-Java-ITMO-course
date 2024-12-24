package MyObjects;

import java.util.Objects;

public abstract class Equipment implements Items {

    protected double wearPercent;
    protected final Materials material;
    protected final double stepAttrition;


    Equipment (Materials mainMaterial, double baseStepAttrition) {
        this.wearPercent = 100;
        this.material = mainMaterial;
        this.stepAttrition = baseStepAttrition;
    }

    @Override
    public double getWearPercent() {
        /* return hp of equipment */
        return this.wearPercent;
    }

    @Override
    public Materials getMaterial() {
        /* return material */
        return this.material;
    }

    @Override
    public  double getStepAttrition() {
        return this.stepAttrition;
    }

    @Override
    public void applyAttrition(double extraPercent) {
        checkingForAnError();
        double wearPerStroke = this.calculateAttrition(extraPercent);
        System.out.printf("%s wear and tear were worn out by %.1f percent\n", this.getClass().toString().split("\\.")[1], wearPerStroke);
        this.attrition(wearPerStroke);

    }

    public abstract int getId();

    public void setWearPercent(double wearPercent) {
        /* set wearPercent */
        this.wearPercent = wearPercent;
    }

    @Override
    public boolean isItWhole() {
        return this.wearPercent > 0;
    }

    protected void attrition(double additionalWear) {
        checkingForAnError();
        this.wearPercent -= additionalWear;
    }

    private double calculateAttrition(double damage_percent) {
        /* calculate attrition and return double with damage */
        return this.stepAttrition * (damage_percent) * this.material.getEnduranceCoefficient();
    }

    private void checkingForAnError() throws UsingOfBrokenEquipment {
        if (!this.isItWhole()) {
            throw new UsingOfBrokenEquipment("Error UsingOfBrokenEquipment has occurred.", this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Equipment equipment = (Equipment) o;
        return  material == equipment.material &&
                wearPercent == equipment.wearPercent &&
                stepAttrition == equipment.stepAttrition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wearPercent, material, stepAttrition);
    }

    @Override
    public String toString() {
        return this.getClass().toString().split("\\.")[1] + "{" +
                "wearPercent='" + wearPercent + '\'' +
                ", material='" + material.toString() + '\'' +
                ", step_attrition=" + stepAttrition + '\''+
                '}';
    }


}
