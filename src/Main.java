import MyObjects.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            Maryushka maryushka = Maryushka.getInstance(Math.random() * 100, Math.random() * 100);
            Falcon falcon = new Falcon(Math.random() * 100);
            House house = new House();
            ArrayList<Items> items = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                items.add(new Boots(Materials.IRON, Math.random() * 10));
                items.add(new Cap(Materials.IRON, Math.random() * 10));
                items.add(new Stick(Materials.IRON, Math.random() * 10));
            }
            house.assemblingHome(Materials.GLASS, (int)(Math.random() * 30), Materials.WOOD, (int)(Math.random() * 30),
                    Materials.WOOD, Materials.IRON, (int)(Math.random() * 30), Materials.STONE, (int)(Math.random() * 30));
            maryushka.setEquipment(items);
            House.Windows window = house.getWindows().get((int) ((house.getWindows().size()-1) * Math.random()));
            falcon.bleed(window);
            maryushka.cry(window);
        } catch (UsingOfBrokenEquipment e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.printf("Error %s\n", e.getMessage());
        } finally {
            System.out.println("Part of the story end\n");
        }
    }
}