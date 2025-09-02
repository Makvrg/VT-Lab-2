package com.example.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;

public final class Venoshock extends SpecialMove {

    public Venoshock() {
        super(Type.POISON, 65.0, 1.0);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        if (Arrays.stream(pokemon.getTypes())
                  .anyMatch(t -> t == Type.POISON)) {
            pokemon.setMod(Stat.HP, (int) Math.round(2 * damage));
        } else {
            pokemon.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected String describe() {
        return "использует Venoshock";
    }

}
