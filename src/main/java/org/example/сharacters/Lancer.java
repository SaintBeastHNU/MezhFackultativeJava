package org.example.сharacters;

public class Lancer extends Warrior{
    private static final int HP = 50;
    private static final int ATTACK = 5;
    public Lancer() {
        super(HP);
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }

    public void dealDamage(Warrior warrior){
        warrior.getDamage(getAttack());
        if (warrior.hasBehind()) {
            warrior.getWarriorBehind().getDamage((getAttack() * 50)/100);
        }
    }

}
