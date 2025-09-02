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

        this.setStats(90.0, 85.0, 75.0, 115.0, 100.0, 115.0);

        this.setType(Type.ELECTRIC);

        this.addMove(new Snarl());
        this.addMove(new ShadowBall());
        this.addMove(new Discharge());
        this.addMove(new Confide());
    }

}
