package MyObjects;

public class Falcon{

    private double hp;

    Falcon(double hp) {
        this.hp = hp;
    }

    public void applyDamage(double damage) {
        hp -= damage;
    }

    public void applyHeal(double heal) {
        hp += heal;
    }

    public double getHp() {
        return hp;
    }

    public void bleed(CoveredObjects onWhatObject) {
        onWhatObject.setCoveringMaterial(Materials.BLOOD);
    }


}
