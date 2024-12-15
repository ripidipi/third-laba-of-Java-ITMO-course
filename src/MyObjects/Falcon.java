package MyObjects;

public class Falcon implements LivingBeing{

    private double hp;

    public Falcon(double heatPoints) {
        this.hp = heatPoints;
    }

    private boolean alive() {
        return hp > 0;
    }

    private void checkingForAnError() {
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
    }

    @Override
    public void applyDamage(double damage) {
        checkingForAnError();
        hp -= damage;
    }

    @Override
    public void applyHeal(double heal) {
        hp += heal;
    }

    @Override
    public double getHp() {
        return hp;
    }

    public void bleed(CoveredObjects onWhatObject) {
        checkingForAnError();
        onWhatObject.setCoveringMaterial(Materials.BLOOD);
    }



}
