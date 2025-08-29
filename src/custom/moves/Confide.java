package custom.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;

public final class Confide extends StatusMove {

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = (new Effect()).turns(0)
                                      .stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(effect);
    }

}
