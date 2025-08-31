import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p11 = new Raikou("Ай тигр", 1);
        Pokemon p12 = new Venonat("Крыса", 1);
        Pokemon p13 = new Pikachu("Пикачу", 1);

        Pokemon p21 = new Venomoth("Муха", 1);
        Pokemon p22 = new Pichu("МиниЧу", 1);
        Pokemon p23 = new Raichu("Сбербанк", 1);

        b.addAlly(p11);
        b.addAlly(p12);
        b.addAlly(p13);

        b.addFoe(p21);
        b.addFoe(p22);
        b.addFoe(p23);

        b.go();
    }

}