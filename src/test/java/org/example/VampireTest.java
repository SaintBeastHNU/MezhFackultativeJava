package org.example;

import org.example.сharacters.Defender;
import org.example.сharacters.Knight;
import org.example.сharacters.Vampire;
import org.example.сharacters.Warrior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VampireTest {

    @Test
    @DisplayName("Smoke test for Vampire task")
    void smokeTest4() {
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();
        var mark = new Warrior();
        var bob = new Defender();
        var mike = new Knight();
        var rog = new Warrior();
        var lancelot = new Defender();
        var eric = new Vampire();
        var adam = new Vampire();
        var richard = new Defender();
        var ogre = new Warrior();

        assertTrue(Battle.fight(chuck, bruce));
        assertFalse(Battle.fight(dave, carl));

        assertTrue(chuck.isAlive());
        assertFalse(bruce.isAlive());
        assertTrue(carl.isAlive());
        assertFalse(dave.isAlive());

        assertFalse(Battle.fight(carl, mark));
        assertFalse(carl.isAlive());

        assertFalse(Battle.fight(bob, mike));
        assertTrue(Battle.fight(lancelot, rog));
        assertFalse(Battle.fight(eric, richard));
        assertTrue(Battle.fight(ogre, adam));

        var myArmy = new Army();
        myArmy.addUnits(Defender::new, 2);
        myArmy.addUnits(Vampire::new, 2);
        myArmy.addUnits(Warrior::new, 1);

        var enemyArmy = new Army();
        enemyArmy.addUnits(Warrior::new, 2);
        enemyArmy.addUnits(Defender::new, 2);
        enemyArmy.addUnits(Vampire::new, 3);

        var army3 = new Army();
        army3.addUnits(Warrior::new, 1);
        army3.addUnits(Defender::new, 4);

        var army4 = new Army();
        army4.addUnits(Vampire::new, 3);
        army4.addUnits(Warrior::new, 2);

        assertFalse(Battle.fight(myArmy, enemyArmy));
        assertTrue(Battle.fight(army3, army4));
    }

    @Test
    @DisplayName("1. Fight")
    void Fight1() {
        var carl = new Warrior();
        var jim = new Knight();

        assertFalse(Battle.fight(carl, jim));
    }

    @Test
    @DisplayName("2. Fight")
    void Fight2() {
        var amon = new Knight();
        var slevin = new Warrior();

        assertTrue(Battle.fight(amon, slevin));
    }

    @Test
    @DisplayName("3. Fight")
    void Fight3() {
        var bob = new Warrior();
        var mars = new Warrior();

        assertTrue(Battle.fight(bob, mars));
    }

    @Test
    @DisplayName("4. Fight")
    void Fight4() {
        var zeus = new Knight();
        var godkiller = new Warrior();

        assertTrue(Battle.fight(zeus, godkiller));
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
        boolean alive = knight.isAlive();
        assertTrue(alive);
    }

    @Test
    @DisplayName("7.Fight")
    void Fight7() {
        var unit1 = new Warrior();
        var unit2 = new Knight();
        var unit3 = new Warrior();

        Battle.fight(unit1, unit2);
        assertFalse(Battle.fight(unit2, unit3));
    }


    @Test
    @DisplayName("8. Fight")
    void Fight8() {
        var vamp = new Vampire();
        var cont = new Warrior();
        assertTrue(Battle.fight(cont, vamp));
    }

    @Test
    @DisplayName("1. Battle")
    void Battle1() {
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits(Defender::new, 5);
        army_1.addUnits(Vampire::new, 6);
        army_1.addUnits(Warrior::new, 7);
        army_2.addUnits(Warrior::new, 6);
        army_2.addUnits(Defender::new, 6);
        army_2.addUnits(Vampire::new, 6);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("2. Battle")
    void Battle2() {
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits(Vampire::new, 3);
        army_1.addUnits(Warrior::new, 4);
        army_2.addUnits(Warrior::new, 4);
        army_2.addUnits(Defender::new, 4);
        army_2.addUnits(Vampire::new, 3);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("3. Battle")
    void Battle3() {
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits(Defender::new, 11);
        army_1.addUnits(Vampire::new, 3);
        army_1.addUnits(Warrior::new, 4);
        army_2.addUnits(Warrior::new, 4);
        army_2.addUnits(Defender::new, 4);
        army_2.addUnits(Vampire::new, 13);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("4. Battle")
    void Battle4() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(Defender::new, 9);
        army_1.addUnits(Vampire::new, 3);
        army_1.addUnits(Warrior::new, 8);
        army_2.addUnits(Warrior::new, 4);
        army_2.addUnits(Defender::new, 4);
        army_2.addUnits(Vampire::new, 13);

        assertTrue(Battle.fight(army_1, army_2));
    }

}

