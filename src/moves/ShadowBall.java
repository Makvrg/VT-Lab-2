package moves;

import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {

    public ShadowBall(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).chance(0.2)
                                      .turns(0)
                                      .stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
    }

}
