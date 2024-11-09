package MyObjects;

import java.lang.reflect.Array;

public enum Effects {

    EMPTY(1, 1, 1, 1, 1),
    POISONING(0.5, 0.7, 0.6, 0.8, 0.7),
    DIZZINESS(0.8, 0.6, 1, 0.9, 0.6),
    BLINDED(0.9, 0.9, 1, 0.1, 1),
    BLEEDING(0.3, 0.8, 1, 0.5, 0.8),
    CRYING(1.1, 1, 1.4, 0.9, 0.8),
    HAPPINESS(1.6, 1.2, 1.5, 1.3, 1.2);

    private final double hp;
    private final double damage;
    private final double level_of_beauty;
    private final double speed;
    private final double intelligence;

    Effects(double hp, double damage, double level_of_beauty, double speed, double intelligence) {
        this.hp = hp;
        this.damage = damage;
        this.level_of_beauty = level_of_beauty;
        this.speed = speed;
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase() +
                " modifiers: hp" + this.hp +
                " / damage " + this.damage +
                " / level of beauty " + this.level_of_beauty +
                " / speed " + this.speed +
                " / intelligence " + this.intelligence;
    }

    public double getHpModifier() {
        return hp;
    }

    public double getDamageModifier() {
        return damage;
    }

    public double getLevelOfBeautyModifier() {
        return level_of_beauty;
    }

    public double getSpeedModifier() {
        return speed;
    }

    public double getIntelligenceModifier() {
        return intelligence;
    }

}
