package MyObjects;

public interface Items {

    public default void brokingTextMessage(){}

    public default double getHp(){return 0;}

    public default void receivingTextMessage(){}

    public default boolean getState() {return true;}

    public default Materials getMaterial() {return Materials.NOTHING;}

    public default double getStepAttrition() {return 0;}

    public default void applyAttrition(double extra_damage_percent){}

    public default String getName(){return "";}
}
