package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;

public final class Venoshock extends SpecialMove {

    public Venoshock(Type type, double power, double accuracy) {
        super(type, power, accuracy);
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

}
