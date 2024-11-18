package MyObjects;

import java.io.Serializable;

public abstract class MinorCharacter extends Character implements SupportingCharacters {

    MinorCharacter(String name, double hp, double damage) {
        super(name, hp, damage);
    }

    @Override
    public abstract void chooseRandomAction(MainCharacter c);

    @Override
    public void move() {
        messageForMove();
    }

    protected void messageForIgnor() {
        System.out.println(this.getClass().toString().split("\\.")[1] + " " + this.name + " just ignored");
    }

    protected void messageForHeal(double amount_of_heal) {
        System.out.println(this.getClass().toString().split("\\.")[1] + " " + this.name + " performs the rite. It heals " + String.format("%.2f", amount_of_heal) + " hp");
    }

    protected void messageForDamage(double amount_of_damage) {
        System.out.println(this.getClass().toString().split("\\.")[1] + " " + this.name + " beats and deals " + String.format("%.2f", amount_of_damage) + " damage");
    }

    protected void messageForMove() {
        System.out.println(this.getClass().toString().split("\\.")[1] + " " + this.name + " has met");
    }

    protected void messageForEffect(Effects effect) {
        System.out.println(this.getClass().toString().split("\\.")[1] + " " + this.name + " imposed the effect of " + effect.toString());
    }
}
