package MyObjects;

public class UsingOfBrokenEquipment extends RuntimeException {

    Items item;

    public UsingOfBrokenEquipment(String message, Items item) {
        super(message);
        this.item = item;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + String.format("\nAttempt to use a broken %s", this.item.getClass().toString().split("\\.")[1]);
    }
}
