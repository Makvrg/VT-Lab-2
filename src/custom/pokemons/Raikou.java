package custom.pokemons;

import custom.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Raikou extends Pokemon {

    public Raikou(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(90.0, 85.0, 75.0, 115.0, 100.0, 115.0);
        this.setType(Type.ELECTRIC);

        this.addMove(new ShadowBall(Type.GHOST, 80.0, 1.0));
        this.addMove(new Snarl(Type.DARK, 55.0, 0.95));
        this.addMove(new Discharge(Type.ELECTRIC, 80.0, 1.0));
        this.addMove(new Confide());
    }

}
