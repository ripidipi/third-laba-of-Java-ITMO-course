package MyObjects;

public class Marushka {

    private double random_value_for_fild_balanced() {
        return 100 * (Math.random() + 0.5);
    }

    private double random_value_for_fild() {
        return 100 * (Math.random());
    }

    static double Hp, Lucky, Strength, Vision;
    static Effects Effect;
    static Items[] Equipment = new Items[0];
    Marushka () {

        Hp = random_value_for_fild_balanced();
        Lucky = random_value_for_fild();
        Strength = random_value_for_fild();
        Vision = random_value_for_fild();
        Effect = Effects.EMPTY;

    }






}
