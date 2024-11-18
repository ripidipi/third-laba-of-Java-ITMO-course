package MyObjects;

import java.util.ArrayList;

public class RandGeneration implements Generator{

    ArrayList<String> names = new ArrayList<>();

    private double baseParameterGeneration() {
        return Math.random() * 100;
    }

    @Override
    public void setNamesList(ArrayList<String> names) {
        this.names = names;
    }

    @Override
    public ArrayList<String> getNamesList() {
        return names;
    }

    @Override
    public void addName(String name){
        names.add(name);
    }

    @Override
    public Protagonist creatingProtagonist() {
        String name = names.get((int)(Math.random() * names.size()));
        double hp = (Math.random() + 0.5) * 100, damage = baseParameterGeneration(),
                level_of_beauty = baseParameterGeneration(), intelligence = baseParameterGeneration(),
                speed = baseParameterGeneration();
        return new Protagonist(name, hp, damage, level_of_beauty, intelligence, speed);
    }

    @Override
    public Bandit creatingBandit() {
        String name = names.get((int)(Math.random() * names.size()));
        double hp = baseParameterGeneration(), damage = baseParameterGeneration();
        return new Bandit(name, hp, damage);
    }

    @Override
    public Beast creatingBeast() {
        String name = names.get((int)(Math.random() * names.size()));
        double hp = baseParameterGeneration(), damage = baseParameterGeneration();
        return new Beast(name, hp, damage);
    }

    @Override
    public Elder creatingElder() {
        String name = names.get((int)(Math.random() * names.size()));
        double hp = baseParameterGeneration(), damage = baseParameterGeneration(), heal = 20;
        return new Elder(name, hp, damage, heal);
    }

    @Override
    public Witch creatingWitch() {
        String name = names.get((int)(Math.random() * names.size()));
        double hp = baseParameterGeneration(), damage = baseParameterGeneration(), heal = 10;
        return new Witch(name, hp, damage, heal);
    }

    @Override
    public Spirit creatingSpirit() {
        String name = names.get((int)(Math.random() * names.size()));
        double hp = baseParameterGeneration(), damage = baseParameterGeneration(), heal = 100;
        return new Spirit(name, hp, damage, heal);
    }

    @Override
    public Equipment creatingEquipment(String name, Materials material) {
        double hp = baseParameterGeneration(), base_step_attrition = (Math.random() + 0.1) * 100;
        return new Equipment(name, hp, material, base_step_attrition);
    }

}
