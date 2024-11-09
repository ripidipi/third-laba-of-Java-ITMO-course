package MyObjects;

import java.util.Random;



public class Bandit extends MinorCharacter {

    Bandit(String name, double hp, double damage) {
        super(name, hp, damage);
    }

    @Override
    public void chooseRandomAction(MainCharacter c) {
        double rand = Math.random();
        if (rand < 0.3) {
            messageForIgnor();
        } else if (rand < 0.6) {
            Effects[] effects = {Effects.DIZZINESS, Effects.BLINDED, Effects.BLEEDING};
            Random randChoose = new Random();
            Effects randomEffect = effects[randChoose.nextInt(effects.length)];
            c.applyEffect(randomEffect);
            messageForEffect(randomEffect);
        } else {
            c.applyDamage(damage);
            messageForDamage(damage);
        }
    }
}
