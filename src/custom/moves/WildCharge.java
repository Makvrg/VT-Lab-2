package custom.moves;

import ru.ifmo.se.pokemon.*;

public final class WildCharge extends PhysicalMove {

    public WildCharge(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) Math.round(damage / 4.0));
    }

}
