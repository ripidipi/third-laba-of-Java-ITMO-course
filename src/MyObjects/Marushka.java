package MyObjects;

public class Marushka extends Character implements MainCharacter {

    private Effects effect;
    private double level_of_beauty;
    private double intelligence;
    private double speed;

    Marushka (String name, double hp, double damage) {
        super(name, hp, damage);
        this.effect = Effects.EMPTY;
    }

    public void move() {}

    @Override
    public void applyDamage(double damage) {
        this.hp -= damage;
    }

    @Override
    public void applyHeal(double heal) {
        this.hp += heal;
    }

    @Override
    public void applyEffect(Effects effect) {
        applicationEffectModifier(effect);
        this.effect = effect;
    }

    @Override
    public double getLevelOfBeauty() {
        return this.level_of_beauty;
    }

    @Override
    public double getIntelligence() {
        return this.intelligence;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }

    private void applicationEffectModifier(Effects effect) {
        this.hp *= effect.getHpModifier();
        this.damage *= effect.getDamageModifier();
        this.level_of_beauty *= effect.getLevelOfBeautyModifier();
        this.intelligence *= effect.getIntelligenceModifier();
        this.speed *= effect.getSpeedModifier();
    }

}
