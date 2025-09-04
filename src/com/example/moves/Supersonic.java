package com.example.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Supersonic extends StatusMove {

    public Supersonic() {
        super.type = Type.NORMAL;
        super.accuracy = 0.55;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Supersonic";
    }

}
