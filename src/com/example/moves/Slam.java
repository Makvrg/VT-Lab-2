package com.example.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Slam extends PhysicalMove {

    public Slam() {
        super(Type.NORMAL, 80.0, 0.75);
    }

    @Override
    protected String describe() {
        return "использует Slam";
    }

}
