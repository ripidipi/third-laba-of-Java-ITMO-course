package MyObjects;

import java.util.ArrayList;

public class StepHandler {

    public boolean step(Protagonist protagonist, Bandit bandit, Elder elder,
                        Spirit spirit, Witch witch, Beast beast,
                        ArrayList<Items> items, ArrayList<SupportingCharacters> supports) {
        double rand  = Math.random();
        if (items.isEmpty() && rand < 0.2) {
            spirit.chooseRandomAction(protagonist);
            return false;
        } else if (protagonist.getHp() <= 0) {
            System.out.println("\n\nThe story is lost, the main character is defeated :(\n\n");
            return false;
        }
        if (rand < 0.5) {
            supports.get((int) (Math.random() * supports.size())).chooseRandomAction(protagonist);
        }
        return true;
    }

}
