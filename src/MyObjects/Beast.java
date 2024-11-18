package MyObjects;

import java.util.Random;

public class Beast extends MinorCharacter{
    Beast(String name, double hp, double damage) {
        super(name, hp, damage);
    }

    @Override
    public void chooseRandomAction(MainCharacter c) {
        double rand = Math.random();
        if (rand < 0.6) {
            messageForIgnor();
        } else if (rand < 0.8) {
            Effects[] effects = {Effects.BLINDED, Effects.BLEEDING};
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
