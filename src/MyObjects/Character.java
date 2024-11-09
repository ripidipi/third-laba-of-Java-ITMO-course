package MyObjects;

public abstract class Character implements LivingBeing {

    protected String name;
    protected double hp;
    protected double damage;

    Character(String name, double hp, double damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public abstract void move();

}
