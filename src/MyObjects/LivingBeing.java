package MyObjects;

public interface LivingBeing {

    default double getHp () {return 0;}

    void applyDamage (double damage);

    void applyHeal (double heal);
}
