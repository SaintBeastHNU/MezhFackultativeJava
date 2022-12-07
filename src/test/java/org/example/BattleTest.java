package org.example;

import org.example.сharacters.Knight;
import org.example.сharacters.Warrior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

//    @Test
//    @DisplayName("Smoke test for Warrior and Knight task")
//    void smokeTest1() {
//        var chuck = new Warrior();
//        var bruce = new Warrior();
//        var carl = new Knight();
//        var dave = new Warrior();
//
//
//        assertTrue(Battle.fight(chuck, bruce));
//        assertFalse(Battle.fight(dave, carl));
//        assertTrue(chuck.isAlive());
//        assertFalse(bruce.isAlive());
//        assertTrue(carl.isAlive());
//        assertFalse(dave.isAlive());
//    }

    @Test
    @DisplayName("1.Fight")
    void Fight1() {
        var carl = new Warrior();
        var jim = new Knight();

        assertFalse(Battle.fight(carl, jim));
    }

    @Test
    @DisplayName("2.Fight")
    void Fight2() {
        var ramon = new Knight();
        var slevin = new Warrior();

        assertTrue(Battle.fight(ramon, slevin));
    }

    @Test
    @DisplayName("3.Fight")
    void Fight3() {
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob, mars);
        boolean alive = bob.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("4.Fight")
    void Fight4() {
        var zeus = new Knight();
        var godKiller = new Warrior();

        Battle.fight(zeus, godKiller);
        boolean alive = zeus.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("5.Fight")
    void Fight5() {
        var husband = new Warrior();
        var wife = new Warrior();

        Battle.fight(husband, wife);
        boolean alive = wife.isAlive();
        assertFalse(alive);
    }

    @Test
    @DisplayName("6.Fight")
    void Fight6() {
        var dragon = new Warrior();
        var knight = new Knight();

        Battle.fight(dragon, knight);
        boolean alive  = knight.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("7.Fight")
    void Fight7() {
        var unit1 = new Warrior();
        var unit2 = new Knight();
        var unit3  = new Warrior();

        Battle.fight(unit1, unit2);
        assertFalse(Battle.fight(unit2, unit3));
    }


}