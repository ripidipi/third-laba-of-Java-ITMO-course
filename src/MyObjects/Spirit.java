package MyObjects;

public class Spirit extends MinorCharacter implements Healer{

    private final double heal_base;

    Spirit(String name, double hp, double damage, double heal) {
        super(name, hp, damage);
        this.heal_base = heal;
    }

    @Override
    public void heal(MainCharacter c, double heal) {
        c.applyHeal(heal);
    }

    private double calculateRandomHeal() {
        return (-Math.log10(Math.random()) * this.heal_base);
    }

    public void chooseRandomAction(MainCharacter c) {
        double random_heal = calculateRandomHeal();
        heal(c, random_heal);
        messageForHeal(random_heal);
        endMessage(c);
    }

    private void endMessage(MainCharacter c) {
        System.out.println(c.getName() + " met " + this.getClass().toString().split("\\.")[1] + ' ' + this.name + ".\nEnd of the story");
    }

}
