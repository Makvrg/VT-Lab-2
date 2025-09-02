package com.example.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class ZenHeadbutt extends PhysicalMove {

    public ZenHeadbutt() {
        super(Type.PSYCHIC, 80.0, 0.90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.2)
                                    .attack(0.0)
                                    .turns((int) (Math.random() * 4.0 + 1.0));
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Zen Headbutt";
    }

}
