package custom.pokemons;

import custom.moves.Rest;
import custom.moves.Slam;
import custom.moves.WildCharge;
import ru.ifmo.se.pokemon.Type;

public class Pikachu extends Pichu{

    public Pikachu(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(35.0, 55.0, 40.0, 50.0, 50.0, 90.0);
        this.setType(Type.ELECTRIC);

        this.addMove(new WildCharge(Type.ELECTRIC, 90.0, 1.0));
        this.addMove(new Rest());
        this.addMove(new Slam(Type.NORMAL, 80.0, 0.75));
    }

}
