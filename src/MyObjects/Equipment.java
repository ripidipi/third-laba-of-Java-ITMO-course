package MyObjects;

import java.util.Objects;

public class Equipment implements Items {

    protected double hp;
    protected boolean state; // state is equipment total or if it's broken (total - 1, broken - 0)
    protected final Materials material;
    protected final String name;
    protected final double step_attrition;

    Equipment (String equipment_name, double hp, Materials main_material, double base_step_attrition) {
        this.hp = hp;
        this.material = main_material;
        this.state = true;
        this.step_attrition = base_step_attrition;
        this.name = equipment_name;
    }

    @Override
    public void brokingTextMessage() {
        /* print message if hp <= 0, it's mean that equipment broken */
        System.out.println("The " + this.name + " is broken");
    }

    private void messageForAttrition(double damage) {
        System.out.printf("During this time, the %s %s was worn out by %.2f\n", this.material, this.name, damage);
    }

    @Override
    public double getHp() {
        /* return hp of equipment */
        return this.hp;
    }

    @Override
    public void receivingTextMessage() {
        /* print message if character received equipment */
        System.out.println("The " + this.name + " has been received");
    }

    @Override
    public boolean getState() {
        /* return state of equipment */
        return this.state;
    }

    @Override
    public Materials getMaterial() {
        /* return material */
        return this.material;
    }

    @Override
    public  double getStepAttrition() {
        return this.step_attrition;
    }

    @Override
    public void applyAttrition(double extra_damage_percent) {
        /* apply attrition for boots */
        double damage = this.calculateAttrition(extra_damage_percent);
        messageForAttrition(damage);
        this.attrition(damage);
    }

    public void setState(boolean new_state) {
        /* set state */
        this.state = new_state;
    }

    public void setHp(double new_hp) {
        /* set hp */
        hp = new_hp;
        if (this.hp <= 0) {
            state = false;
        }
    }

    public String getName() {
        return this.name;
    }

    protected void attrition(double damage) {
        /* apply damage that equipment take every step */
        this.hp -= damage;
        if (this.hp <= 0) {
            state = false;
        }
    }

    private double calculateAttrition(double damage_percent) {
        /* calculate attrition and return double with damage */
        return this.step_attrition * (damage_percent) * this.material.getEnduranceCoefficient();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Equipment equipment = (Equipment) o;
        return  Objects.equals(name, equipment.name) &&
                hp == equipment.hp &&
                material == equipment.material &&
                state == equipment.state &&
                step_attrition == equipment.step_attrition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, material, state, step_attrition);
    }

    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", material='" + material.toString() + '\'' +
                ", state=" + state + '\''+
                ", step_attrition=" + step_attrition + '\''+
                '}';
    }
}
