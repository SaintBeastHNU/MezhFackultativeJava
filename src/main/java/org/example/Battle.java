package org.example;

import org.example.сharacters.Warrior;

public class Battle {
    public static boolean fight(Warrior w1, Warrior w2) {
        while(w1.isAlive() && w2.isAlive()) {
            w1.dealDamage(w2);
            if(w2.isAlive()) {
                w2.dealDamage(w1);
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
