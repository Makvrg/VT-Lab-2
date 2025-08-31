package pokemons;

import moves.Supersonic;
import moves.Venoshock;
import moves.ZenHeadbutt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Venonat extends Pokemon {

    public Venonat(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(60.0, 55.0, 50.0, 40.0, 55.0, 45.0);
        this.setType(Type.BUG, Type.POISON);

        this.addMove(new Venoshock(Type.POISON, 65.0, 1.0));
        this.addMove(new ZenHeadbutt(Type.PSYCHIC, 80.0, 0.90));
        this.addMove(new Supersonic());
    }

}
