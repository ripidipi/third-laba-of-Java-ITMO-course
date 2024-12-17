package MyObjects;

public interface LivingBeing {

    public default double getHp () {return 0;}

    public void applyDamage (double damage);

    public void applyHeal (double heal);
}
