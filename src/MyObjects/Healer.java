package MyObjects;

public interface Healer {

    public default void heal(MainCharacter c, double heal) {}

    public default double getBasicHeal() {return 0;}

}
