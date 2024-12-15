package MyObjects;

import java.util.ArrayList;
import java.util.Objects;

public class Maryushka implements MainCharacter, LivingBeing {

    static final int age = 16;
    static private double hp;
    static private double levelOfBeauty;
    static private ArrayList<Items> equipments = new ArrayList<Items>();

    public Maryushka(double heatPoints, double levelOfMaryushkaBeauty) {
        hp = heatPoints;
        levelOfBeauty = levelOfMaryushkaBeauty;
    }

    public void cry(CoveredObjects onWhatObject) {
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
        onWhatObject.setCoveringMaterial(Materials.WATER);
        levelOfBeauty++;
        System.out.println("Maryushka level of beauty +1");
    }

    private boolean alive() {
        return hp > 0;
    }

    @Override
    public void applyDamage(double damage) {
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
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
        System.out.println("Maryushka got " + equipmentsList.toString());
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
