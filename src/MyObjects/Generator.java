package MyObjects;

import java.util.ArrayList;

public interface Generator {

    public default Protagonist creatingProtagonist() {return null;}

    public default Bandit creatingBandit() {return null;}

    public default Beast creatingBeast() { return null;}

    public default Elder creatingElder() {return null;}

    public default Witch creatingWitch() {return null;}

    public default Spirit creatingSpirit() {return null;}

    public default Equipment creatingEquipment(String name, Materials material) {return null;}

    public default ArrayList<String> getNamesList() { return null;}

    public default void setNamesList(ArrayList<String> names) {}

    public default void addName(String name) {}
}
