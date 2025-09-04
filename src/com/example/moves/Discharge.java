package com.example.moves;

import ru.ifmo.se.pokemon.*;

public final class Discharge extends SpecialMove {

    public Discharge() {
        super(Type.ELECTRIC, 80.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            Effect effect = new Effect().condition(Status.PARALYZE)
                                        .stat(Stat.SPEED, -2)
                                        .chance(0.30)
                                        .attack(0.75)
                                        .turns(-1);
            pokemon.setCondition(effect);
        }
    }

    @Override
    protected String describe() {
        return "использует Discharge";
    }

}
