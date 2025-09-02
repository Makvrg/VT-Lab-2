package com.example.pokemons;

import com.example.moves.Slam;

public class Pikachu extends Pichu {

    public Pikachu(String name, int level) {
        super(name, level);

        this.setStats(35.0, 55.0, 40.0, 50.0, 50.0, 90.0);

        this.addMove(new Slam());
    }

}
