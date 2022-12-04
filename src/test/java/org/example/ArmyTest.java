package org.example;

import org.example.Characters.Warrior;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArmyTest {

    @Test
    @DisplayName("1. Battle")
    void Battle1() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 1);
        army_2.addUnits(() -> new Warrior(), 2);
        var battle = Battle.fight(army_1, army_2);
        assertEquals(false, battle);
    }

    @Test
    @DisplayName("2. Battle")
    void Battle2() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 2);
        army_2.addUnits(() -> new Warrior(), 3);
        var battle = Battle.fight(army_1, army_2);
        assertEquals(false, battle);
    }

    @Test
    @DisplayName("3. Battle")
    void Battle3() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 5);
        army_2.addUnits(() -> new Warrior(), 7);
        var battle = Battle.fight(army_1, army_2);
        assertEquals(false, battle);
    }

    @Test
    @DisplayName("4. Battle")
    void Battle4() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 20);
        army_2.addUnits(() -> new Warrior(), 21);
        var battle = Battle.fight(army_1, army_2);
        assertEquals(true, battle);
    }

    @Test
    @DisplayName("5. Battle")
    void Battle5() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 10);
        army_2.addUnits(() -> new Warrior(), 11);
        var battle = Battle.fight(army_1, army_2);
        assertEquals(true, battle);
    }

    @Test
    @DisplayName("6. Battle")
    void Battle6() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new Warrior(), 11);
        army_2.addUnits(() -> new Warrior(), 7);
        var battle = Battle.fight(army_1, army_2);
        assertEquals(true, battle);
    }

}
