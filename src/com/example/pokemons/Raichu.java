package com.example.pokemons;

import com.example.moves.TailWhip;

public final class Raichu extends Pikachu {

    public Raichu(String name, int level) {
        super(name, level);

        this.setStats(60.0, 90.0, 55.0, 90.0, 80.0, 110.0);

        this.addMove(new TailWhip());
    }

}
