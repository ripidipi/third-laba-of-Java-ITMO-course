package MyObjects;

import java.util.Objects;

public class ActionWithDeadCharacter extends RuntimeException {

    LivingBeing livingBeing;

    public ActionWithDeadCharacter(String message, LivingBeing livingBeing) {
        super(message);
        this.livingBeing = livingBeing;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + String.format("Attempting an action with a dead %s\n", this.livingBeing.getClass().toString().split("\\.")[1]);
    }
}
