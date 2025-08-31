package moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {

    {
        this.type = Type.PSYCHIC;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        Effect effect = (new Effect()).condition(Status.SLEEP)
                                      .chance(1.0)
                                      .attack(0.0)
                                      .turns(2);
        pokemon.setMod(Stat.HP, (int) (pokemon.getHP() - pokemon.getStat(Stat.HP)));
        pokemon.setCondition(effect);
    }

}
