import MyObjects.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Generator rand = new RandGeneration();
        Protagonist protagonist = rand.creatingProtagonist();
        Bandit bandit = rand.creatingBandit();
        Spirit spirit = rand.creatingSpirit();
        Elder elder = rand.creatingElder();
        Witch witch = rand.creatingWitch();
        Beast beast = rand.creatingBeast();
        ArrayList<Items> items = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            items.add(rand.creatingEquipment("Boot" + ('1' + i), Materials.IRON));
            items.add(rand.creatingEquipment("Hat" + ('1' + i), Materials.IRON));
            items.add(rand.creatingEquipment("Stick" + ('1' + i), Materials.IRON));
        }

    }

}