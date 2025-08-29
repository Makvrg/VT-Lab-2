package custom.moves;

import ru.ifmo.se.pokemon.*;

public final class Snarl extends SpecialMove {

    public Snarl(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).turns(0)
                                      .stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.setCondition(effect);
    }

}
