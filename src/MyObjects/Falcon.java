package MyObjects;

public class Falcon implements LivingBeing{

    private double hp;

    public Falcon(double heatPoints) {
        this.hp = heatPoints;
    }

    private boolean alive() {
        return hp > 0;
    }

    @Override
    public void applyDamage(double damage) {
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
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
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
        onWhatObject.setCoveringMaterial(Materials.BLOOD);
    }



}
