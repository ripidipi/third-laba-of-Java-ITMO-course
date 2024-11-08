package MyObjects;

import java.io.Serializable;

public class Elder extends Character implements Healer, Villains {

    private final double heal_base;

    Elder(String name, double hp, double damage, double heal) {
        super(name, hp, damage);
        this.heal_base = heal;
    }

    @Override
    public void heal(MainCharacter c, double heal) {
        c.applyHeal(heal);
    }

    private double calculateRandomHeal() {
        return (-Math.log10(Math.random()) * this.heal_base);
    }

}
