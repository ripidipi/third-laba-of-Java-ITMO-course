package MyObjects;

import java.util.ArrayList;
import java.util.Objects;

public class Maryushka implements MainCharacter {

    static final int age = 16;
    static private double hp;
    static private double levelOfBeauty;
    static private ArrayList<Items> equipments = new ArrayList<Items>();

    Maryushka(double heatPoints, double levelOfMaryushkaBeauty) {
        hp = heatPoints;
        levelOfBeauty = levelOfMaryushkaBeauty;
    }

    public void cry(CoveredObjects onWhatObject) {
        onWhatObject.setCoveringMaterial(Materials.WATER);
        levelOfBeauty++;
    }

    @Override
    public void applyDamage(double damage) {
        hp -= damage;
    }

    @Override
    public void applyHeal(double heal) {
        hp += heal;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public double getLevelOfBeauty() {
        return levelOfBeauty;
    }

    @Override
    public ArrayList<Items> getEquipments() {
        return equipments;
    }

    @Override
    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    @Override
    public void removeEquipment(Equipment equipment) {
        equipments.remove(equipment);
    }

    @Override
    public void setEquipment(ArrayList<Items> equipmentsList) {
        equipments.clear();
        equipments.addAll(equipmentsList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Maryushka maryushka = (Maryushka) o;
        return true;

    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, age, equipments);
    }

    @Override
    public String toString() {
        return "Maryushka{" +
                "hp='" + hp + '\'' +
                ", age='" + age + '\'' +
                ", level of beauty='" + levelOfBeauty + '\'' +
                ", equipments=" + equipments + '\'' +
                '}';
    }

}
