package MyObjects;

public interface LivingBeing {

    public default double getHp () {return 0;}

    public default void applyDamage (double damage) {}

    public default void applyHeal (double heal) {}
}
