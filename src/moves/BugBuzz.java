package moves;

import ru.ifmo.se.pokemon.*;

public final class BugBuzz extends SpecialMove {

    public BugBuzz(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).chance(0.1)
                                      .turns(0)
                                      .stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
    }

}
