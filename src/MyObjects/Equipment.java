package MyObjects;

public class Equipment implements Items {

    private double hp;
    private boolean state; // state is equipment total or it's broken (total - 1, broken - 0)
    private final Materials material;

    Equipment (double hp, Materials main_material) {
        this.hp = hp;
        material = main_material;
        state = true;
    }

    @Override
    public void broking_text_message() {
        /* print message if hp <= 0, it's mean that equipment broken */
        System.out.println("The equipment is Broken");
    }

    @Override
    public double get_hp() {
        /* return hp of equipment */
        return this.hp;
    }

    @Override
    public void receiving_text_message() {
        /* print message if character received equipment */
        System.out.println("The equipment has been received");
    }

    @Override
    public boolean get_state() {
        /* return state of equipment */
        return this.state;
    }

    @Override
    public Materials get_material() {
        /* return material */
        return this.material;
    }

    public void set_state(boolean new_state) {
        /* set state */
        this.state = new_state;
    }

    public void set_hp(double new_hp) {
        /* set hp */
        hp = new_hp;
    }

    protected void attrition(double extra_damage_percent) {
        /* set damage that equipment take every step, if it's necessary with extra_damage_percent (1 + extra_damage_percent) */
        this.hp -= 10 * (1 + extra_damage_percent) * this.material.getEnduranceCoficent();
    }

    protected void attrition() {
        /* set damage that equipment take every step */
        this.hp -= 10 * this.material.getEnduranceCoficent();
    }

}
