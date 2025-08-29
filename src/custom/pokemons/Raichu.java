package custom.pokemons;

import custom.moves.Rest;
import custom.moves.Slam;
import custom.moves.TailWhip;
import custom.moves.WildCharge;
import ru.ifmo.se.pokemon.Type;

public final class Raichu extends Pikachu{

    public Raichu(String name, int level) {
        super(name, level);
    }

    {
        this.setStats(60.0, 90.0, 55.0, 90.0, 80.0, 110.0);
        this.setType(Type.ELECTRIC);

        this.addMove(new WildCharge(Type.ELECTRIC, 90.0, 1.0));
        this.addMove(new Rest());
        this.addMove(new Slam(Type.NORMAL, 80.0, 0.75));
        this.addMove(new TailWhip(Type.NORMAL, 0.0, 1.0));
    }

}
