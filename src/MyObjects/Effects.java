package MyObjects;

public enum Effects {

    EMPTY,
    POISONING,
    DIZZINESS,
    BLINDED,
    BLEEDING;

    @Override
    public String toString() {
        return "Effects is " + super.toString().toLowerCase();
    }

}
