package com.example.pokemons;

import com.example.moves.Confide;
import com.example.moves.Discharge;
import com.example.moves.ShadowBall;
import com.example.moves.Snarl;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Raikou extends Pokemon {

    public Raikou(String name, int level) {
        super(name, level);

        super.setStats(90.0, 85.0, 75.0, 115.0, 100.0, 115.0);

        super.setType(Type.ELECTRIC);

        super.addMove(new Snarl());
        super.addMove(new ShadowBall());
        super.addMove(new Discharge());
        super.addMove(new Confide());
    }

}
