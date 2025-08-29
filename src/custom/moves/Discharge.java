package custom.moves;

import ru.ifmo.se.pokemon.*;

public final class Discharge extends SpecialMove {

    public Discharge(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            Effect effect = (new Effect()).condition(Status.PARALYZE)
                                          .stat(Stat.SPEED, -2)
                                          .chance(0.30)
                                          .attack(0.75)
                                          .turns(-1);
            pokemon.setCondition(effect);
        }
    }

}
