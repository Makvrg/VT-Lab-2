import custom.pokemons.Pichu;
import custom.pokemons.Pikachu;
import custom.pokemons.Raichu;
import custom.pokemons.Raikou;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Raikou("Ай тигр", 1);

        Pokemon p2 = new Raichu("Электроприбор", 1);

        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }

}