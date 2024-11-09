package MyObjects;

public class Bandit extends MinorCharacter {

    Bandit(String name, double hp, double damage) {
        super(name, hp, damage);
    }

    @Override
    public void chooseRandomAction(MainCharacter c) {
        double rand = Math.random();
        if (rand < 0.3) {
            messageForIgnor();
        } else if (rand < 0.5) {

        } else {
            c.applyDamage(damage);
            messageForDamage(damage);
        }
    }
}
