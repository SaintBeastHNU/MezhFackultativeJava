package org.example.сharacters;

public class Knight extends Warrior {

    private final static int ATTACK = 7;

    public Knight() {
        super();
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }
}
