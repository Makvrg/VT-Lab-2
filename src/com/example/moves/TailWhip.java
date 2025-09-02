package com.example.moves;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove {

    public TailWhip() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(1.0)
                                    .turns(0)
                                    .stat(Stat.DEFENSE, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Tail Whip";
    }

}
