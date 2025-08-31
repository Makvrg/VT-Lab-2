package custom.pokemons;

import custom.moves.TailWhip;
import ru.ifmo.se.pokemon.Type;

public final class Raichu extends Pikachu {

    public Raichu(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(60.0, 90.0, 55.0, 90.0, 80.0, 110.0);

        this.addMove(new TailWhip(Type.NORMAL, 0.0, 1.0));
    }

}
