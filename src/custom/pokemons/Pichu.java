package custom.pokemons;

import custom.moves.Rest;
import custom.moves.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {

    public Pichu(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(20.0, 40.0, 15.0, 35.0, 35.0, 60.0);
        this.setType(Type.ELECTRIC);

        this.addMove(new WildCharge(Type.ELECTRIC, 90.0, 1.0));
        this.addMove(new Rest());
    }

}
