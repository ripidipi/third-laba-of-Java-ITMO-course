package MyObjects;

public enum Effects {

    EMPTY,
    POISONING,
    DIZZINESS,
    BLINDED,
    BLEEDING;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }

    public String effectChanges() {
        return "";
    }
}
