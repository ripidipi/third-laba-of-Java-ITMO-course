package MyObjects;

import java.util.Objects;

public class Witch extends MinorCharacter implements Healer{

    private final double heal_base;

    Witch(String name, double hp, double damage, double heal) {
        super(name, hp, damage);
        this.heal_base = heal;
    }

    @Override
    public void heal(MainCharacter c, double heal) {
        c.applyHeal(heal);
    }

    @Override
    public double getBasicHeal() {
        return this.heal_base;
    }

    private double calculateRandomHeal() {
        return (-Math.log10(Math.random()) * this.heal_base);
    }

    @Override
    public void chooseRandomAction(MainCharacter c) {
        double rand = Math.random();
        if (rand < 0.7) {
            messageForIgnor();
        } else if (rand < 0.8) {
            double rand_heal = calculateRandomHeal();
            heal(c, rand_heal);
            messageForHeal(rand_heal);
        } else {
            c.applyDamage(damage);
            messageForDamage(damage);
        }
    }

    private void setEffect(MainCharacter c, Effects effect) {
        c.applyEffect(effect);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Witch witch = (Witch) o;
        return  Objects.equals(name, witch.name) &&
                hp == witch.hp &&
                damage == witch.damage &&
                heal_base == witch.heal_base;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, damage, heal_base);
    }

    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage='" + damage + '\'' +
                ", heal_base=" + heal_base + '\''+
                '}';
    }
}
