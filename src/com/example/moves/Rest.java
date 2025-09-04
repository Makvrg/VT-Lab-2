package com.example.moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {

    public Rest() {
        super.type = Type.PSYCHIC;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        Effect effect = new Effect().condition(Status.SLEEP)
                                    .chance(1.0)
                                    .attack(0.0)
                                    .turns(2);
        pokemon.setMod(Stat.HP, (int) (pokemon.getHP() - pokemon.getStat(Stat.HP)));
        pokemon.setCondition(effect);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }

}
