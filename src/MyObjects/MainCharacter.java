package MyObjects;

public interface MainCharacter {

    public default void applyDamage(double damage) {}

    public default void applyHeal(double heal) {}

    public default void applyEffect(Effects effect) {}

}
