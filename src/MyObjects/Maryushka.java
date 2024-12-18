package MyObjects;

import java.util.ArrayList;
import java.util.Objects;

public class Maryushka implements MainCharacter, LivingBeing {

    final int age = 16;
    private double hp;
    private double levelOfBeauty;
    private ArrayList<Items> equipments = new ArrayList<Items>();

    private static Maryushka instance;

    private Maryushka(double heatPoints, double levelOfMaryushkaBeauty) {
        hp = heatPoints;
        levelOfBeauty = levelOfMaryushkaBeauty;
    }

    public static Maryushka getInstance(double heatPoints, double levelOfMaryushkaBeauty) {
        if (instance == null) {
            instance = new Maryushka(heatPoints, levelOfMaryushkaBeauty);
        }
        return instance;
    }

    public void cry(CoveredObjects onWhatObject) {
        checkingForAnError();
        onWhatObject.setCoveringMaterial(Materials.WATER);
        levelOfBeauty++;
        System.out.println("Maryushka level of beauty +1");
    }

    private boolean alive() {
        return hp > 0;
    }

    private void checkingForAnError() {
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
    }

    @Override
    public void applyDamage(double damage) {
        checkingForAnError();
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
