package MyObjects;

public class ViolationOfConstruction extends Exception {

    public ViolationOfConstruction(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " House Assembling failed";
    }
}
