package org.example;

import org.example.сharacters.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LancerTest {
    @Test
    @DisplayName("Smoke test for Lancer task")
    void smokeTest5() {
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
        var freelancer = new Lancer();
        var vampire = new Vampire();

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
        assertTrue(Battle.fight(freelancer, vampire));
        assertTrue(freelancer.isAlive());

        var myArmy = new Army();
        myArmy.addUnits(Defender::new, 2);
        myArmy.addUnits(Vampire::new, 2);
        myArmy.addUnits(Lancer::new, 4);
        myArmy.addUnits(Warrior::new, 1);

        var enemyArmy = new Army();
        enemyArmy.addUnits(Warrior::new, 2);
        enemyArmy.addUnits(Lancer::new, 2);
        enemyArmy.addUnits(Defender::new, 2);
        enemyArmy.addUnits(Vampire::new, 3);

        var army3 = new Army();
        army3.addUnits(Warrior::new, 1);
        army3.addUnits(Lancer::new, 1);
        army3.addUnits(Defender::new, 2);

        var army4 = new Army();
        army4.addUnits(Vampire::new, 3);
        army4.addUnits(Warrior::new, 1);
        army4.addUnits(Lancer::new, 2);

        assertTrue(Battle.fight(myArmy, enemyArmy));
        assertFalse(Battle.fight(army3, army4));
    }

    @Test
    @DisplayName("1. Battle")
    void Battle1() {
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits(Lancer::new, 5);
        army_1.addUnits(Vampire::new, 3);
        army_1.addUnits(Warrior::new, 4);
        army_1.addUnits(Defender::new, 2);
        army_2.addUnits(Warrior::new, 4);
        army_2.addUnits(Defender::new, 4);
        army_2.addUnits(Vampire::new, 6);
        army_2.addUnits(Lancer::new, 5);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("2. Battle")
    void Battle2() {
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits(Lancer::new, 7);
        army_1.addUnits(Vampire::new, 3);
        army_1.addUnits(Warrior::new, 4);
        army_1.addUnits(Defender::new, 2);
        army_2.addUnits(Warrior::new, 4);
        army_2.addUnits(Defender::new, 4);
        army_2.addUnits(Vampire::new, 6);
        army_2.addUnits(Lancer::new, 4);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("3. Battle")
    void Battle3() {
        var army_warrior = new Army();
        var army_lancer = new Army();

        army_warrior.addUnits(Warrior::new,2);
        army_lancer.addUnits(Lancer::new,1);
        army_lancer.addUnits(Warrior::new, 1);

        assertFalse(Battle.fight(army_warrior, army_lancer));

    }

}
