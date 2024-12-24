package MyObjects;

public class Falcon implements LivingBeing{

    private double hp;

    public Falcon(double heatPoints) {
        this.hp = heatPoints;
    }

    private boolean alive() {
        return hp > 0;
    }

    private void checkingForAnError() throws ActionWithDeadCharacter {
        if (!this.alive()) {
            throw new ActionWithDeadCharacter("Error ActionWithDeadCharacter. ", this);
        }
    }

    @Override
    public void applyDamage(double damage) throws ActionWithDeadCharacter {
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

    public void bleed(CoveredObjects onWhatObject) throws ActionWithDeadCharacter {
        checkingForAnError();
        onWhatObject.setCoveringMaterial(Materials.BLOOD);
    }



}
