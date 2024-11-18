package MyObjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Protagonist extends Character implements MainCharacter {

    private Effects effect;
    private double level_of_beauty;
    private double intelligence;
    private double speed;
    private ArrayList<Items> equipments = new ArrayList<Items>();

    Protagonist(String name, double hp, double damage, double level_of_beauty, double intelligence, double speed) {
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

    @Override
    public ArrayList<Items> getEquipments() {
        return this.equipments;
    }

    @Override
    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    @Override
    public void removeEquipment(Equipment equipment) {
        this.equipments.remove(equipment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Protagonist protagonist = (Protagonist) o;
        return  Objects.equals(name, protagonist.name) &&
                hp == protagonist.hp &&
                damage == protagonist.damage &&
                level_of_beauty == protagonist.level_of_beauty &&
                intelligence == protagonist.intelligence &&
                speed == protagonist.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, damage, level_of_beauty, intelligence, speed);
    }

    @Override
    public String toString() {
        return "Witch{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage='" + damage + '\'' +
                ", level_of_beauty=" + level_of_beauty + '\''+
                ", intelligence=" + intelligence + '\''+
                ", speed=" + speed + '\''+
                '}';
    }

}
