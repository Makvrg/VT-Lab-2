package com.example.moves;

import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {

    public ShadowBall() {
        super(Type.GHOST, 80.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.2)
                                    .turns(0)
                                    .stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Shadow Ball";
    }

}
