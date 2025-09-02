package com.example.moves;

import ru.ifmo.se.pokemon.*;

public final class Snarl extends SpecialMove {

    public Snarl() {
        super(Type.DARK, 55.0, 0.95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(0)
                                    .stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Snarl";
    }

}
