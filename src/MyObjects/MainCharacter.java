package MyObjects;

public interface MainCharacter {

    public default void applyDamage(double damage) {}

    public default void applyHeal(double heal) {}

    public default void applyEffect(Effects effect) {}

    public default double getLevelOfBeauty() {return 0;}

    public default double getIntelligence() {return 0;}

    public default double getSpeed() {return 0;}
}
