package MyObjects;

public class Equipment implements Items {

    protected double hp;
    protected boolean state; // state is equipment total or it's broken (total - 1, broken - 0)
    protected final Materials material;
    protected final String name;
    protected final double step_attrition;

    Equipment (String eqpm_name, double hp, Materials main_material, double base_step_attrition) {
        this.hp = hp;
        this.material = main_material;
        this.state = true;
        this.step_attrition = base_step_attrition;
        this.name = eqpm_name;
    }

    @Override
    public void brokingTextMessage() {
        /* print message if hp <= 0, it's mean that equipment broken */
        System.out.println("The " + this.name + " is broken");
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
    public void applyAttrition(double extra_damage_percent) {
        /* apply attrition for boots */
        this.attrition(this.calculateAttrition(extra_damage_percent));
    }

    public void setState(boolean new_state) {
        /* set state */
        this.state = new_state;
    }

    public void setHp(double new_hp) {
        /* set hp */
        hp = new_hp;
    }

    protected void attrition(double damage) {
        /* apply damage that equipment take every step */
        this.hp -= damage;
    }

    private double calculateAttrition(double damage_percent) {
        /* calculate attrition and return double with damage */
        return this.step_attrition * (damage_percent) * this.material.getEnduranceCoficent();
    }
}
