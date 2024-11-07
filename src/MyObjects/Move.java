package MyObjects;

public class Move {

    Move () {}

    public static Characters random_character() {
        double rnd = Math.random();
        if (rnd < 0.7) {
            return Characters.NOBODY;
        } else if (rnd < 0.75) {
            return Characters.WITCH;
        } else if (rnd < 0.80) {
            return Characters.WIZARD;
        } else if (rnd < 0.94) {
            return Characters.DRUNK;
        } else if (rnd < 0.96) {
            return Characters.BANDITS;
        } else {
            return Characters.SPIRIT;
        }
    }



}
