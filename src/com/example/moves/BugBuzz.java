package com.example.moves;

import ru.ifmo.se.pokemon.*;

public final class BugBuzz extends SpecialMove {

    public BugBuzz() {
        super(Type.BUG, 90.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1)
                                    .turns(0)
                                    .stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Bug Buzz";
    }

}
