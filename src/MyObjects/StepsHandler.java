package MyObjects;

public interface StepsHandler {

    public default void Start() {}

    public default void eachStepGen() {}

    public default void End() {}
}
