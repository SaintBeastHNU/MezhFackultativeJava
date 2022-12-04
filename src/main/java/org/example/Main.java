package org.example;

import org.example.Characters.Defender;
import org.example.Characters.Warrior;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Defender d = new Defender();
        Warrior w = new Warrior();

        System.out.println(        d.getHealth());
        Battle.fight(d, w);

    }
}