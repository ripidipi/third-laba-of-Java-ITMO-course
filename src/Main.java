import MyObjects.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Generator rand = new RandGeneration();
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "James", "Oliver", "Sophia", "Emma", "Liam",
                "Ava", "Isabella", "Lucas", "Mason", "Charlotte",
                "Ethan", "Amelia", "Logan", "Harper", "Elijah",
                "Scarlett", "Jackson", "Emily", "Aiden", "Madison",
                "Benjamin", "Abigail", "Michael", "Mia", "Daniel"
        ));
        rand.setNamesList(names);
        Protagonist protagonist = rand.creatingProtagonist();
        Bandit bandit = rand.creatingBandit();
        Spirit spirit = rand.creatingSpirit();
        Elder elder = rand.creatingElder();
        Witch witch = rand.creatingWitch();
        Beast beast = rand.creatingBeast();
        ArrayList<Items> items = new ArrayList<>();
        ArrayList<SupportingCharacters> supports = new ArrayList<SupportingCharacters>();
        supports.add(bandit); supports.add(elder); supports.add(witch); supports.add(beast);
        for (int i = 1; i < 4; i++) {
            items.add(rand.creatingEquipment("Boot" + ('1' + i), Materials.IRON));
            items.add(rand.creatingEquipment("Hat" + ('1' + i), Materials.IRON));
            items.add(rand.creatingEquipment("Stick" + ('1' + i), Materials.IRON));
        }
        protagonist.setEquipment(items);
        StepHandler stepHandler = new StepHandler();
        int i = 0;
        System.out.println("\n\nThe story started!!!The story continues, the move is number 0\"");
        while(stepHandler.step(protagonist, bandit, elder,
                spirit, witch, beast,
                items, supports)) {
            System.out.println("\n\nThe story continues, the move is number " + ++i);
            Thread.sleep(1000);
        }
    }

}