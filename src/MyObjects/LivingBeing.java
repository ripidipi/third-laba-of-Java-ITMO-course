package MyObjects;

public interface LivingBeing {

    public default double getHp(){return 0;}

    public default double getDamage(){return 0;}

    public default String getName(){return "";}

    public abstract void move();
}
