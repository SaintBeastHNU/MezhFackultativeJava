package org.example;

import org.example.сharacters.Warrior;

import java.util.LinkedList;
import java.util.Objects;
import java.util.function.Supplier;

public class Army {

    private LinkedList<Warrior> army;

    public Army() {
        army = new LinkedList<>();
    }
    public void addUnits(Warrior warrior) {
        warrior.setNextWarrior(army.peekLast());
        if (isLastWarrior(army.peekLast())) {
            army.peekLast().setWarriorBehind(warrior);
        }

        army.add(warrior);
    }
    public void addUnits(Supplier<Warrior> army, int count) {
        for (int i = 0; i < count; i++) {
            addUnits(army.get());
        }
    }

    public LinkedList<Warrior> getArmy() {
        return army;
    }

    public boolean isArmyEmpty() {
        if (Objects.nonNull(army)) {
            return army.isEmpty();
        }
        return true;
    }

    private boolean isLastWarrior(Warrior warrior){
        return warrior != null;
    }

}
