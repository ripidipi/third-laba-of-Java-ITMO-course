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
        if (rand < 0.7) {
            supports.get((int) (Math.random() * supports.size())).chooseRandomAction(protagonist);
        } else {
            System.out.println("No one is met, we just go ahead");
        }
        ArrayList<String> items_names = new ArrayList<String>();
        ArrayList<Items> delete_items = new ArrayList<Items>();
        Obstacle obstacle = Obstacle.randomObstacle();
        for (Items item : items) {
            boolean fl = true;
            for (String items_name: items_names) {
                if (item.getName().substring(0, item.getName().length() - 1).equals(items_name)) {
                    fl = false;
                }
            }
            if (fl) {
                items_names.add(item.getName().substring(0, item.getName().length() - 1));
                item.applyAttrition(obstacle.getEnduranceCoefficient());
                if(!item.getState()) {
                    item.brokingTextMessage();
                    delete_items.add(item);
                }
            }
        }
        System.out.printf("%s add extra endurance coefficient %.2f\n", obstacle.toString(), obstacle.getEnduranceCoefficient());
        for (Items item : delete_items) {
            items.remove(item);
        }
        return true;
    }

}
