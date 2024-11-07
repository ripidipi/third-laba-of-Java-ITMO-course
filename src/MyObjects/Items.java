package MyObjects;

public interface Items {

    public default void broking_text_message(){}

    public default double get_hp(){return 0;}

    public default void receiving_text_message(){}

    public default boolean get_state() {return true;}

    public default Materials get_material() {return Materials.NOTHING;}

}
