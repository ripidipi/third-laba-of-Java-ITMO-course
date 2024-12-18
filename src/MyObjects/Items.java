package MyObjects;

public interface Items {

    default double getWearPercent(){return 0;}

    default Materials getMaterial() {return Materials.NOTHING;}

    default double getStepAttrition() {return 0;}

    default void applyAttrition(double extra_damage_percent){}

    boolean isItWhole();

    int getId();
}
