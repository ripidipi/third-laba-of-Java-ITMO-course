package MyObjects;

public class Character implements LivingBeing {

    protected String name;
    protected double hp;
    protected double damage;

    Character(String name, double hp, double damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getDamage() {
        return damage;
    }

    public void applyDamage(double damage) {
        this.hp -= damage;
    }

}
