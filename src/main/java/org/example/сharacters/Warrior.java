package org.example.Characters;

public class Warrior {
    private int health;
    private static final int ATTACK = 5;
    private Warrior warriorBehind;
    private Warrior nextWarrior;

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


    public void getDamage(int damage) {
        setHealth(getHealth() - damage);
    }
    public void dealDamage(Warrior warrior) {
        warrior.getDamage(this.getAttack());
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public boolean hasBehind() {
        return warriorBehind != null;
    }

    public void setWarriorBehind(Warrior warriorBehind) {
        this.warriorBehind = warriorBehind;
    }

    protected Warrior getWarriorBehind() {
        return warriorBehind;
    }

    public Warrior getNextWarrior() {
        return nextWarrior;
    }

    public void setNextWarrior(Warrior nextWarrior) {
        this.nextWarrior = nextWarrior;
    }
}
