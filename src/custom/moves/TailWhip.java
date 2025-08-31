package custom.moves;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {

    public TailWhip(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).chance(1.0)
                                      .turns(0)
                                      .stat(Stat.DEFENSE, -1);
        pokemon.addEffect(effect);
    }

}
