package MyObjects;

public class Spirit extends MinorCharacter{

    public Spirit(String name, double hp, double damage) {
        super(name, hp, damage);
    }

    public void chooseRandomAction(MainCharacter c) {
        endMessage(c);
    }

    private void endMessage(MainCharacter c) {
        System.out.println(c.getName() + " met " + this.getClass() + ' ' + this.name + ".\nEnd of the story");
    }

}
