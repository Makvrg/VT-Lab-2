package com.example.pokemons;

import com.example.moves.Rest;
import com.example.moves.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {

    public Pichu(String name, int level) {
        super(name, level);

        this.setStats(20.0, 40.0, 15.0, 35.0, 35.0, 60.0);
        this.setType(Type.ELECTRIC);

        this.addMove(new WildCharge());
        this.addMove(new Rest());
    }

}
