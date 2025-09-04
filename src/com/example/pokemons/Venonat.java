package com.example.pokemons;

import com.example.moves.Supersonic;
import com.example.moves.Venoshock;
import com.example.moves.ZenHeadbutt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Venonat extends Pokemon {

    public Venonat(String name, int level) {
        super(name, level);

        super.setStats(60.0, 55.0, 50.0, 40.0, 55.0, 45.0);
        super.setType(Type.BUG, Type.POISON);

        super.addMove(new ZenHeadbutt());
        super.addMove(new Venoshock());
        super.addMove(new Supersonic());
    }

}
