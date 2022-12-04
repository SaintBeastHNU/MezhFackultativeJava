package org.example;

import org.example.Characters.Warrior;

public class Battle {
    public static boolean fight(Warrior w1, Warrior w2) {
        while(w1.isAlive() && w2.isAlive()) {
            w2.getDamage(w1);
            if(w2.isAlive()) {
                w1.setHealth(w1.getHealth() - w2.getAttack());
            }
        }
        return w1.isAlive();
    }

    public static boolean fight(Army army1, Army army2) {
        while (!army1.isArmyEmpty() && !army2.isArmyEmpty()) {
            boolean fightResult = fight(army1.getArmy().peek(), army2.getArmy().peek());
            if (fightResult)
                army2.getArmy().remove();
            else
                army1.getArmy().remove();
        }
        return !army1.isArmyEmpty();
    }
}
