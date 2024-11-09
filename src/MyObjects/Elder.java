package MyObjects;

import java.util.Objects;

public class Elder extends MinorCharacter implements Healer {

    private final double heal_base;

    Elder(String name, double hp, double damage, double heal) {
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

    @Override
    public void chooseRandomAction(MainCharacter c) {
        double rand = Math.random();
        if (rand < 0.2) {
            messageForIgnor();
        } else {
            double rand_heal = calculateRandomHeal();
            c.applyHeal(rand_heal);
            messageForHeal(rand_heal);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || (getClass() != o.getClass())) {return false;}
        Elder elder = (Elder) o;
        return  Objects.equals(name, elder.name) &&
                hp == elder.hp &&
                damage == elder.damage &&
                heal_base == elder.heal_base;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hp, damage, heal_base);
    }

    @Override
    public String toString() {
        return "Elder{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage='" + damage + '\'' +
                ", heal_base=" + heal_base + '\''+
                '}';
    }
}
