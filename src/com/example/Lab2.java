package com.example;

import com.example.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2 {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon p11 = new Raikou("Ай тигр", 1);
        Pokemon p12 = new Venonat("Крыса", 1);
        Pokemon p13 = new Pikachu("Пикачу", 1);

        Pokemon p21 = new Venomoth("Муха", 1);
        Pokemon p22 = new Pichu("МиниЧу", 1);
        Pokemon p23 = new Raichu("Сбербанк", 1);

        battle.addAlly(p11);
        battle.addAlly(p12);
        battle.addAlly(p13);

        battle.addFoe(p21);
        battle.addFoe(p22);
        battle.addFoe(p23);

        battle.go();
    }

}
