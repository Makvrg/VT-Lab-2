package custom.moves;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {

    {
        this.type = Type.NORMAL;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).turns(0)
                                      .stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(effect);
    }

}
