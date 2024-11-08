package MyObjects;

public class Witch extends Character implements Villains, Healer{

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

    private void messageForIgnor() {
        System.out.println("Witch just ignored");
    }

    private void messageForHeal(double amount_of_heal) {
        System.out.println("Witch got potion. It heals " + amount_of_heal + " hp");
    }

    private void messageForDamage(double amount_of_damage) {
        System.out.println("Witch beats with a cane and deals " + amount_of_damage + " damage");
    }
}
