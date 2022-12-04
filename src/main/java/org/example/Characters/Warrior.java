package org.example.Characters;

public class Warrior {
    private int health;
    private static final int ATTACK = 5;

    public Warrior() {
        this.health = 50;
    }
    public Warrior(int health) {
        this.health = health;
    }

    public int getAttack() {
        return ATTACK;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }



    public void getDamage(Warrior warrior) {
        setHealth(health - warrior.getAttack());
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
