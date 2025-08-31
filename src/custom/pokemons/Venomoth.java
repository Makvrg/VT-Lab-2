package custom.pokemons;

import custom.moves.BugBuzz;
import ru.ifmo.se.pokemon.Type;

public final class Venomoth extends Venonat {

    public Venomoth(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(70.0, 65.0, 60.0, 90.0, 75.0, 90.0);

        this.addMove(new BugBuzz(Type.BUG, 90.0, 1.0));
    }

}
