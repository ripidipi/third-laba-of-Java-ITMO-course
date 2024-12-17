package MyObjects;

public interface Items {

    public default double getWearPercent(){return 0;}

    public default Materials getMaterial() {return Materials.NOTHING;}

    public default double getStepAttrition() {return 0;}

    public default void applyAttrition(double extra_damage_percent){}

    public boolean isItWhole();

    abstract int getId();
}
