package com.example.pokemons;

import com.example.moves.BugBuzz;

public final class Venomoth extends Venonat {

    public Venomoth(String name, int level) {
        super(name, level);

        super.setStats(70.0, 65.0, 60.0, 90.0, 75.0, 90.0);

        super.addMove(new BugBuzz());
    }

}
